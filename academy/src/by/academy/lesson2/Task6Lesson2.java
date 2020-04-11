package by.academy.lesson2;

import java.util.Scanner;

public class Task6Lesson2 {
	public static void main(String[] args) {
//		Ввести две строки с консоли. Определить, является ли одна строка перестановкой 
//		символов другой строки. Учитываем регистр. Не использовать сортировку :) 
//	Например: 
//	1.	“hello” и “hlleo” -> true
//	2.	“hello” и “art” -> false
	}

	public boolean permutation() {
		System.out.print("Введите слово ");
		Scanner inputFigure = new Scanner(System.in);
		String s = inputFigure.nextLine();
		System.out.print("Введите второе слово");
		String t = inputFigure.nextLine();

		if (s.length() != t.length()) {
			return false; // возвращает значение
		}
		int[] letters = new int[256]; // Ascii символы
		char[] s_array = s.toCharArray(); // "Hello" => ['H','e','l','l','o']
		for (char c : s_array) { // записывает в переменную с, символ из массива s_array в цикле
			letters[c]++; // увеличит на 1 значение ячейки в массиве letters. С индексом текущего символа
		}
		for (int i = 0; i < t.length(); i++) { //
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) { // в массиве при совпадении, цифра уменьшится на 1,
									// потом оно вернется.
				return false;
			}
		}
		 System.out.println(true);

	}
}
	