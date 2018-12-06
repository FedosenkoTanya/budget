package springboot;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryMessageRepository implements MessageRepository {

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<Long, Category> categories = new ConcurrentHashMap<Long, Category>();

    @Override
    public Iterable<Category> findAll() {
        return this.categories.values();
    }

    @Override
    public Category save(Category category) {
        Long id = category.getId();
        if (id == null) {
            id = counter.incrementAndGet();
           category.setId(id);
        }
        this.categories.put(id, category);
        return category;
    }

    @Override
    public Category findMessage(Long id) {
        return this.categories.get(id);
    }


    @Override
    public void delete(Category category) {
        if(category!=null) {
            categories.remove(category);
        }
    }

    @Override
    public void delete(Long id) {
        if(id!=null) {
           categories.remove(id);
        }

    }

}

