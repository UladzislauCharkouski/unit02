package com.epam.unit02.main;

public class Task10 {
//Найти max{min(a, b), min(c, d)}.
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=2;
		int d=6;
		int result=Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("Result =" +result);
	}
}