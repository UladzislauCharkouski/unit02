package com.epam.unit02.main;

import java.util.Scanner;

public class TrainingTask04 {
//Âû÷èñëèòü çíà÷åíèå ôóíêöèè F(x), 9: åñëè x<=-3, 1/x2+1: åñëè x>3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ââåäèòå çíà÷åíèå x:");
        double x = sc.nextDouble();
		if (x<=-3 ) {
			System.out.println("F(x)=9");
		} else if (x>3) {
			System.out.println("F(x)= " + (1 / (Math.pow(x,2) + 1)));
		} else {
			System.out.println("F(x) - íå íàéäåíî, õ äîëæåí áûòü ìåíüøå èëè ðàâåí -3 èëè áîëüøå 3");
		}
	}
}
// Отлично. Каких-то значимых замечаний по заданиям модуля 2 нет.
