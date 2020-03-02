package com.epam.unit02.main;

public class Task05 {
//—оставить программу нахождени€ наименьшего из квадратов двух чисел а и b.
	public static void main(String[] args) {
		int a=4;
		int b=6;
		int s=2; // степень
		double x=Math.pow(a, s);
		double z=Math.pow(b, s);
		if (x>z) {
			System.out.println(" вадрат числа b меньше квадрата числа a");
		}
		if (x<z) {
			System.out.println(" вадрат числа a меньше квадрата числа b");
		}
	}
}