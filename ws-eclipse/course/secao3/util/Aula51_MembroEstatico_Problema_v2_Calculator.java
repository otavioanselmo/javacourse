package util;

public class Aula51_MembroEstatico_Problema_v2_Calculator {

	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
}
