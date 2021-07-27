package util;

public class calcu {

	public static final double PI = 3.14159;
	
	public double circu(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * (radius * radius * radius) / 3.0;
		
	}
}
