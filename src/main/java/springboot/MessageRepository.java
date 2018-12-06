package springboot;


interface MessageRepository {

    Iterable<Category> findAll();

    Category save(Category category);

    Category findMessage(Long id);

}

