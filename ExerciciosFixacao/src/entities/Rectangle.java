package entities;

public class Rectangle {
	public double width, height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return (width * 2.0) + (height * 2.0);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
	}
}
