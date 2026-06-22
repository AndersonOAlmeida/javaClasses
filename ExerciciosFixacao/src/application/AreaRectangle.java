package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class AreaRectangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		sc.close();
		
		System.out.println("AREA = " + String.format("%.2f", rec.Area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rec.Perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rec.Diagonal()));
	}
}
