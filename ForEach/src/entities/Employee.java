package entities;

public class Employee {
    private String name;
    private int id;
    private double salary = 0.0;

    public String getName() { return name; }

    public int getId() { return id; }

    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }

    public void setId (int id) { this.id = id; }

    public void setInitialSalary(double salary) { this.salary += salary; }

    public double increaseSalary(double percent) {
        double raisePercent = percent / 100.0;
        double realRaise = salary * raisePercent;
        return salary + realRaise;
    }
}
