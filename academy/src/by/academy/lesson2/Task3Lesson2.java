package by.academy.lesson2;

import java.util.Scanner;

public class Task3Lesson2 {

//	Задание 3.
//	Ввести с консоли число от 1 до 10, вывести на экран 
//	таблицу умножения для этого числа. (10 чисел).

	public static void main(String[] args) {

		System.out.print("Введите число от 1 до 10  ");
		Scanner number = new Scanner(System.in);
		int i = number.nextInt();

		if (i > 0 && i <= 10) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		} else {
			System.out.print("Введите снова число от 1 до 10  ");
			return;
		}

//		if (i > 10) {
//			System.out.println("Введите другое число");}
//		else {		
//		System.out.println("1 * " + i + " = " + i*1 );
//	    System.out.println("2 * " + i + " = " + i*2 );
//	    System.out.println("3 * " + i + " = " + i*3 );
//	    System.out.println("4 * " + i + " = " + i*4 );
//	    System.out.println("5 * " + i + " = " + i*5 );
//	    System.out.println("6 * " + i + " = " + i*6 );
//	    System.out.println("7 * " + i + " = " + i*7 );
//	    System.out.println("8 * " + i + " = " + i*8 );
//	    System.out.println("9 * " + i + " = " + i*9 );
//	    System.out.println("10 * " + i + " = " + i*10 );}
	}
}
