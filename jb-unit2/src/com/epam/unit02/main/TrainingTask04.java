package com.epam.unit02.main;

import java.util.Scanner;

public class TrainingTask04 {
//Вычислить значение функции F(x), 9: если x<=-3, 1/x2+1: если x>3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x:");
        double x = sc.nextDouble();
		if (x<=-3 ) {
			System.out.println("F(x)=9");
		} else if (x>3) {
			System.out.println("F(x)= " + (1 / (Math.pow(x,2) + 1)));
		} else {
			System.out.println("F(x) - не найдено, х должен быть меньше или равен -3 или больше 3");
		}
	}
}
