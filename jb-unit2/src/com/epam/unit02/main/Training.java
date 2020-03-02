package com.epam.unit02.main;

import java.util.Scanner;

public class Training {
public static void main1(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=2;
	int b=3;
	System.out.println("¬ведите число: ");
	if (sc.hasNextInt()) {
		b=sc.nextInt();
	}
	if (a<b) {
		System.out.println("yes");
	} else {
		System.out.println("no");
	}
}
}