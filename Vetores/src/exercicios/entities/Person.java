package exercicios.entities;

public class Person {
    private String name;
    private int age;
    private double height;

    /* Getters */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    /* Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /* Construtores */
    public Person(String name, int age, double height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }
}
