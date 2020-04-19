package by.academy.lesson2;

public class BankCardsTask4Les3 {

	public static void main(String[] args) {
		Visa home = new Visa();
		home.discont(33);
		Prior mastercard = new Prior();
		mastercard.stockPrior("dddd");
	}
}

class Visa {
	double discountVisa = 0.3;
	int sum;

	public void discont(int sum) {
		System.out.println("Скидка по карте " + sum * discountVisa);
	}
}

class MasterCard {
	double discountMasterCard = 0.2;
	int sum;

	public void discont(int sum) {
		System.out.println("Скидка по карте " + sum * discountMasterCard);
	}
}

class BelCard {
	double discountBelCard = 0.1;
	int sum;

	public void discont(int sum) {
		System.out.println("Скидка по карте " + sum * discountBelCard);
	}
}

class Vtb {
	private double year;
	String nameCard;

	public void stockVtb(String nameCard) {
		if (nameCard == "Visa" || nameCard == "VISA") {
			year = 0.5;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else if (nameCard == "MasterCard" || nameCard == "MASTER CARD" || nameCard == "Master card"
				|| nameCard == "mastercard" || nameCard == "Mastercard") {
			year = 1;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else {
			System.out.println("Белкарт выдаём навсегда");
		}
	}
}

class Prior {
	private double year;
	String nameCard;

	public void stockPrior(String nameCard) {
		if (nameCard == "Visa" || nameCard == "VISA") {
			year = 1;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else if (nameCard == "MasterCard" || nameCard == "MASTER CARD" || nameCard == "Master card"
				|| nameCard == "mastercard" || nameCard == "Mastercard") {
			year = 2;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else {
			System.out.println("Белкарт выдаём навсегда");
		}
	}
}

class Mtb {
	private double year;
	String nameCard;

	public void stockMtb(String nameCard) {
		if (nameCard == "Visa" || nameCard == "VISA") {
			year = 2;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else if (nameCard == "MasterCard" || nameCard == "MASTER CARD" || nameCard == "Master card"
				|| nameCard == "mastercard" || nameCard == "Mastercard") {
			year = 3;
			System.out.println("Выдаст " + nameCard + " " + year + " лет");
		} else {
			System.out.println("Белкарт выдаём навсегда");
		}
	}
}
