package com.epam.unit02.main;

import java.util.Scanner;

public class TrainingTask01 {
//—оставить программу сравнени€ двух чисел 1 и 2. ≈сли 1 меньше 2 Ц вывести на экран цифру 7, в противном случае Ц цифру 8.
//—оставить программу сравнени€ двух чисел 1 и 2. ≈сли 1 меньше 2 Ц вывести на экран слово Ђyesї, в противном случае Ц слово Ђnoї
//—оставить программу сравнени€ введенного числа а и цифры 3. ¬ывести на экран слово Ђyesї, если число а меньше 3; если больше, то вывести слово Ђnoї.
	public static void main(String[] args) {
	int a=2;
	int c=3;
	if (a<c) {
		System.out.println(7);
	} else {
		System.out.println(8);
	}
	
	System.out.println("-------------------------------");
	
	if (a<c) {
		System.out.println("yes");
	} else {
		System.out.println("no");
	}
	
	System.out.println("-------------------------------");
	
	Scanner sc= new Scanner(System.in);
	System.out.println("¬ведите число: ");
	int b=sc.nextInt();
	if (b<3) {
		System.out.println("yes");
	} 
	if (b>3)
		System.out.println("no");
	}
}