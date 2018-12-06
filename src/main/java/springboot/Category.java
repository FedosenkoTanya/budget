package springboot;


/**
 * Модель категории
 */
public class Category {
    private Long id;
    private String name;





    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category(String name) {
        this.name = name;


    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }


}
