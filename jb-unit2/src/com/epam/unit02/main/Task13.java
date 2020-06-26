package com.epam.unit02.main;

public class Task13 {
//Íàéäèòå íàèáîëüøóþ öèôðó äàííîãî íàòóðàëüíîãî ÷èñëà.
	public static void main(String[] args) {
		String s="12487128467";
	    String[] a = s.split("");
	    int max = 0;
	    for(int i=0;i<a.length;i++){
            if(Integer.parseInt(a[i])>max) {
            	max=Integer.parseInt(a[i]);
            }
         }// аккуратней с форматированием кода
	    	System.out.println("Íàèáîëüøàÿ öèôðà íàòóðàëüíîãî ÷èñëà =" + max);
	}
}
 
