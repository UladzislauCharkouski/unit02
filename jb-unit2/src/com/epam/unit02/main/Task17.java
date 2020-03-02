package com.epam.unit02.main;

public class Task17 {
//ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void main(String[] args) {
	int n = 5;
    double a = 2.2;
    double x = 1;

    for (int i = 0; i <= n; i++) {
    	x = x * (a + i);
    }
    System.out.println("Result " + x);
	}
}
