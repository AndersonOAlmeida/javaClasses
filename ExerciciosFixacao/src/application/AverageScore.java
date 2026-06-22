package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class AverageScore {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student est = new Student();
		
		est.name = sc.nextLine();
		est.n1 = sc.nextDouble();
		while (est.n1 > 30.00) {
			System.out.println("Insert a value lower than 30.00!");
			est.n1 = sc.nextDouble();
		}
		
		est.n2 = sc.nextDouble();
		while (est.n2 > 35.00) {
			System.out.println("Insert a value lower than 35.00!");
			est.n2 = sc.nextDouble();
		}
		
		est.n3 = sc.nextDouble();
		while (est.n3 > 35.00) {
			System.out.println("Insert a value lower than 35.00!");
			est.n3 = sc.nextDouble();
		}
		sc.close();
		
		if (est.Score() <= 60) {
			double dif = 60 - est.Score();
			System.out.println("FINAL GRADE: " + String.format("%.2f", est.Score()));
			System.out.println("FAILED");
			System.out.println("MISSING " + dif + " POINTS");
		} else {
			System.out.println("FINAL GRADE: " + String.format("%.2f", est.Score()));
			System.out.println("PASSED");
		}
	}
}
