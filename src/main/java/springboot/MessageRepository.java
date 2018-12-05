package springboot;


interface MessageRepository {

    Iterable<Category> findAll();

    Category save(Category product);

    Category findMessage(Long id);

}

