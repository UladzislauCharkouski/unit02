package com.epam.unit02.main;

public class Task15 {
//Найдите количество четных цифр данного натурального числа.
	public static void main(String[] args) {
		int a = 1223445678;
		String b=Integer.toString(a);
		String[] c = b.split("");
		int z = 0;
		int x = 0;
	    for (int i=0; i<c.length; i++) {
	    	x=Integer.parseInt(c[i]);
	    	if (x%2==0) {
	    		z++;
		    }
	    }
	    System.out.println("Количество чётных чисел натурального числа а = " +z);
	}	
}
