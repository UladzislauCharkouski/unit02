package com.epam.unit02.main;

public class Task13 {
//Найдите наибольшую цифру данного натурального числа.
	public static void main(String[] args) {
		String s="3210401";
	    //String[] a = s.split("");
	    String x="123456789";
	    String max = "";
	    for(int i=0;i<s.length();i++){
	        //x=Integer.parseInt(a[i]);
             for(int k=0; k<x.length();k++) {
            	 //System.out.println(s.charAt(i));
            	 //System.out.println(x.charAt(k));
            	 if(s.charAt(i) < x.charAt(k)){
         			if(!max.contains(String.valueOf(s.charAt(i)))){
                         max += "\n" + s.charAt(i);
                         }
                 }
            	 //System.out.println(max);
	         }
          //System.out.println(max);
	     }
	    System.out.println(max);
	}
}
//System.out.println(x);