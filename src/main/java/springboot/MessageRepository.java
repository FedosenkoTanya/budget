package springboot;


interface MessageRepository {

    Iterable<Category> findAll();

    Category save(Category category);

    Category findMessage(Long id);

    void delete(Category category);

    void delete(Long id);
}

