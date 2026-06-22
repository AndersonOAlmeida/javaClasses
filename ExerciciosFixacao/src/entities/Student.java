package entities;

public class Student {
	public String name;
	public double n1, n2, n3, media;
	
	public double Score() {
		media = n1 + n2 + n3;
		return media;
	}
}
