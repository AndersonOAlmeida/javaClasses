package entities;

public class Employee {
    private String name;
    private Integer id;
    private Double salary = 0.0;

    public String getName() { return name; }

    public int getId() { return id; }

    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }

    public void setId (Integer id) { this.id = id; }

    public void setSalary(Double salary) { this.salary = salary; }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    public Employee(Integer id, String name, Double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
