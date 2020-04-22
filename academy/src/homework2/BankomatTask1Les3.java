package homework2;

import java.util.Scanner;

public class BankomatTask1Les3 {

	public static void main(String[] args) {
		int summa;
		int nom20;
		int nom50;
		int nom100;
		BankomatTask1Les3.withdrawMoney();
	}

	public BankomatTask1Les3(int summa, int nom20, int nom50, int nom100) {
		summa = 10000;
		nom20 = 0;
		nom50 = 0;
		nom100 = 0;
	}

	public static void addMoney(int nom20, int nom50, int nom100, int addnom20, int addnom50, int addnom100) {
		nom20 = nom20 + addnom20;
		nom50 = nom50 + addnom50;
		nom100 = nom100 + addnom100;
		int allAddmoney = addnom20 * 20 + addnom50 * 50 + addnom100 * 100;
		int allNoms = nom20 * 20 + nom50 * 50 + nom100 * 100;
		System.out.println(allAddmoney);
	}

	public static boolean withdrawMoney() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму, которую хотите снять, кратную 20: ");
		int summa = sc.nextInt();
		if (summa % 20 != 0) {
			System.out.println("Вы ввели неккоректную сумму");
			return false;
		}
		System.out.println("Введите номинал 20,50,100");
		System.out.println("Колличество купюр по 20$");
		int nom20 = sc.nextInt();
		if (nom20 > summa) {
			System.out.println("Вы ввели неккоректную сумму");
		} else if (nom20 * 20 == summa) {
			System.out.println("Возьмите деньги");
			return false;
		}
		System.out.println("Колличество купюр по 50$");
		int nom50 = sc.nextInt();
		if (nom50 > summa) {
			System.out.println("Вы ввели неккоректную сумму");
		} else if (nom50 * 50 + nom20 * 20 == summa) {
			System.out.println("Возьмите деньги");
			return false;
		}
		System.out.println("Колличество купюр по 100$");
		int nom100 = sc.nextInt();
		if (nom100 > summa) {
			System.out.println("Вы ввели неккоректную сумму");
		} else if (nom100 * 100 + nom50 * 50 + nom20 * 20 == summa) {
			System.out.println("Возьмите деньги");
			return false;
		}
		return false;
	}
}
