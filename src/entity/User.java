package entity;

public class User extends AbstractEntity {

    private int id;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int id, String name) {

        this.name = name;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
