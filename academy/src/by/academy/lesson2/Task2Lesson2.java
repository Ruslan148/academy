package by.academy.lesson2;

import java.util.Locale;
import java.util.Scanner;

public class Task2Lesson2 {

	public static void main(String[] args) {
//		Задание 2.
//		Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
//	a) если тип данных int, вывести остаток от деления на 2
//	b) если double, вывести 70% от числа 
//	c) если float, возвести в квадрат
//	d) если char, вывести код символа
//	e) String, вывести на экран строку в виде ("Hello " + переменная)
//	f) во всех остальных случаях вывести на экран ("Unsupported type");
		System.out.println("Введите тип данных (int, double, float, char, String ) ");
		Scanner inputType = new Scanner(System.in);
		String type = inputType.nextLine();

		switch (type) {
		case ("int"):
			System.out.println("Введите число ");
			int Инт = inputType.nextInt();
			System.out.println(Инт % 2);
			break;
		case ("double"):
			System.out.println("Введите число ");
			double Дубль = inputType.nextDouble();
			System.out.println(Дубль * 0.3);
			break;
		case ("float"):
			System.out.println("Введите число ");
			float Флоат = inputType.nextFloat();
			System.out.println(Флоат * Флоат);
			break;
		case ("char"):
			System.out.println("Введите число ");
			char Чар = inputType.next().charAt(0);
			System.out.println((int) Чар);
			break;
		case ("String"):
			System.out.println("Введите число ");
			String Стринг = inputType.next();
			System.out.println("Hello " + Стринг);
			break;
		default:
			System.out.println("Неизвестный тип");
		}
	}
}
