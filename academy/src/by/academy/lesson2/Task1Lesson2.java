package by.academy.lesson2;

import java.util.Scanner;

public class Task1Lesson2 {

	public static void main(String[] args) {
//		Задание 1.
//		Ввести с консоли сумму покупки в магазине и возраст покупателя, 	
//		в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.
//	Скидки:
//	1) Сумма до 100 рублей -> 5%
//	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
//	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
//	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
//	5) Сумма покупки больше 400 рублей включая -> 20%
//
//	В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
//	и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. 

		System.out.print("Введите сумму ");
		Scanner inputFigure = new Scanner(System.in);
		int i = inputFigure.nextInt();
		System.out.print("Введите возраст покупателя ");
		int m = inputFigure.nextInt();

		if (i < 0)
			return;
		if (i < 100) {
			System.out.println("Итого:" + (i * 0.95f));
		} else if (i >= 100 && i < 200) {
			System.out.println("Итого:" + (i * 0.93f));
		} else if (i >= 200 && i < 300) {
			if (m > 18) {
				System.out.println("Итого:" + (i * 0.84f));
			} else {
				System.out.println("Итого:" + (i * 0.91f));
			}
		} else if (i >= 300 && i < 400) {
			System.out.println("Итого:" + (i * 0.85f));
		} else if (i >= 400) {
			System.out.println("Итого:" + (i * 0.80f));
		}
	}
}