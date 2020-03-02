package com.epam.unit02.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {
//Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак подчеркивания Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите текст>");
		
		while(sc.hasNextLine() == true) {
			String str= sc.nextLine();
			if (Pattern.matches("^[_a-zA-Z][a-zA-Z0-9_]*$", str)) {
				System.out.println("Вы ввели верное значение");
			}else {
				System.out.println("Вы ввели неверное значение, попробуйте ещё раз");
				System.out.print("> ");
			}
			}
		}
}