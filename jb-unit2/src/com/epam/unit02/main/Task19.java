package com.epam.unit02.main;

public class Task19 {
//Вывести на экран соответствий между символами и их численными обозначениямив памяти компьютера (Таблицу ASCII)
	public static void main(String[] args) {
	for (int i = 32; i <= 126; i++) {
        System.out.println(i + "---------" + (char) i);
    	}
	}
}
