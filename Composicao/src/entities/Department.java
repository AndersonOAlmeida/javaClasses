package entities;

public class Department {
    private String name;

    /* Getters e Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* Construtores */
    public Department() {}

    public Department(String name) {
        setName(name);
    }
}
