package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class EmployeeSalary {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.print("\nEmployee: " + emp.name + ", $ " + String.format("%.2f",  emp.NetSalary()));
		
		System.out.print("\n\nWhich percentage to increase salary? ");
		emp.IncreaseSalary(sc.nextDouble());
		sc.close();
		
		System.out.print("Updated data: " + emp.name + ", $ " + String.format("%.2f", emp.grossSalary));
	}
}
