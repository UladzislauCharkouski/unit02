package com.epam.unit02.main;

public class Task07 {
//Составить программу, которая определит площадь какого круга меньше.
	public static void main(String[] args) {
		int r1=4; // радиус первого круга
		int r2=6; // радиус второго круга
		double s1=Math.PI*Math.pow(r1, 2); //Площадь первого круга
		double s2=Math.PI*Math.pow(r2, 2); //Площадь второго круга
		if (s1>s2) {
			System.out.println("Площадь первого круга больше");
		}
		if (s2>s1) {
			System.out.println("Площадь второго круга больше");
		}
	}
}