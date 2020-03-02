package com.epam.unit02.main;

public class Task16 {
//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
	public static void main(String[] args) {
        int x = 3;
        long y = x;

        for (int i = 3; i <= 10; i++) {
            x = x+i;
            y = y*x;
        }
        System.out.println("Result = " + y);
	}
}
