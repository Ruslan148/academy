package by.academy.lesson2;

public class BankomatTask1Les3 {

	public static void main(String[] args) {
		int summa;
		int nom20;
		int nom50;
		int nom100;
		BankomatTask1Les3.withdrawMoney(330,330,330);
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

	public static boolean withdrawMoney(int nom20, int nom50, int nom100) {
		int summa = 100000; // колличесто денег в банкомате
		if (summa > nom20 * 20 + nom50 * 50 + nom100 * 100) {
			summa = summa - nom20 * 20 + nom50 * 50 + nom100 * 100;
			System.out.println("Take, a money");
			
		} else
			System.out.println("Sorry, money is over");
			return false;
		
	}
}