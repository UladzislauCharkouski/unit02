package com.epam.unit02.main;

public class TrainingTask02 {
//Необходимо вывести на экран числа от 1 до 5.
//Необходимо вывести на экран числа от 5 до 1.
//Необходимо вывести на экран таблицу умножения на 3.
	public static void main(String[] args) {
		for(int i=1; i<6; i++) {
		System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=5; i>=1; i--) {
		System.out.println(i);
		}	
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<=10; i++) {
			System.out.println(i + "*3 =" + i*3);
		}	
	}
}