package by.academy.lesson2;

public class Task4Lesson2 {
	public static void main(String[] args) {	
//		Задание 4.
//		Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 

		
		for (int i = 0; i < 21; i++) {
			if (Math.pow(2, i) == 1000000 )
				break;
			System.out.println(Math.pow(2, i));
		}
	}
}