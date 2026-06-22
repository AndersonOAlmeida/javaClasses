package entities;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double NetSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	public void IncreaseSalary(double percentage) {
		double netSalary = grossSalary - tax;
		grossSalary = netSalary + (grossSalary * (percentage / 100));
	}
}
