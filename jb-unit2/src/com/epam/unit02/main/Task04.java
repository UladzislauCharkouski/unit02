package com.epam.unit02.main;

public class Task04 {
//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х.
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int x=4;
		int result = Math.abs(a*x*x+b*x+c);
		System.out.println("Модуль выражения равен:" + result);
	}
}
