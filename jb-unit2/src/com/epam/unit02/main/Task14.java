package com.epam.unit02.main;

public class Task14 {
//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15
	public static void main(String[] args) {
	String x="";
	int c;
    for (int i = 1000; i <= 9999; i++) {
    	x=Integer.toString(i);
    	String[] a = x.split("");
    	String a1 = a[0];
    	String a2 = a[1];
    	String a3 = a[2];
    	String a4 = a[3];
    	c=Integer.parseInt(a1)+Integer.parseInt(a2)+Integer.parseInt(a3)+Integer.parseInt(a4);
    	if (c==15) {
    		System.out.println(i);
    	}
	}
}	
}