package by.academy.lesson2;

public class Task4Lesson2 {
	public static void main(String[] args) {
//		Задание 4.
//		Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 

		int i = 1;
		int x = (int) Math.pow(2, i);
		while (x <= 1000000) {
			x = (int) Math.pow(2, i);
			System.out.println(x);
			i++;
		}

	}
}