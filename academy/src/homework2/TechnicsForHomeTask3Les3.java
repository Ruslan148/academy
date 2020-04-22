package homework2;

public class TechnicsForHomeTask3Les3 {
	/*
	 * Создать иерархию классов, описывающих бытовую технику. Создать несколько
	 * объектов описанных классов, часть из них включить в розетку. Иерархия должна
	 * иметь хотя бы три уровня.
	 */
	public static void main(String[] args) {

		MarkOfFridge atlant = new Atlant();
		atlant.push("On");
		Fridge numb1 = new Fridge();
		numb1.consumption(221);
		System.out.println(" ");
		MarkOfTV horizont = new Horizont();
		horizont.push("On");
		TV numb2 = new TV();
		numb2.consumption(666);
		System.out.println(" ");
		WashingMachine numb3 = new MarkOfWashingMachine();
		numb3.consumption(350);
		System.out.println(" ");
		MarkOfWashingMachine zanussi = new Zanussi();
		zanussi.push("Off");
	}

}

class Fridge {
	String nameFridge = "Atlant ";
	int powerСonsumption;

	public void consumption(int powerСonsumption) {
		this.powerСonsumption = powerСonsumption;
		System.out.println("Расход энергии " + powerСonsumption + " Кват/ч");
	}
}

class MarkOfFridge extends Fridge {
	String name;

	public void push(String name) {
		if (name == "on" || name == "On") {
			System.out.println(nameFridge + "Включён в розетку");
		} else if (name == "off" || name == "Off") {
			System.out.println(nameFridge + "Выключен из розетки");
		} else {
			System.out.println("Нажми на кнопку");
		}
	}
}

class Atlant extends MarkOfFridge {

}

class TV {
	String nameTV = "Horizont ";
	int powerСonsumption;

	public void consumption(int powerСonsumption) {
		this.powerСonsumption = powerСonsumption;
		System.out.println("Расход энергии " + powerСonsumption + " Кват/ч");
	}
}

class MarkOfTV extends TV {
	String name;

	public void push(String name) {
		if (name == "on" || name == "On") {
			System.out.println(nameTV + "Включён в розетку");
		} else if (name == "off" || name == "Off") {
			System.out.println(nameTV + "Выключен из розетки");
		} else {
			System.out.println("Нажми на кнопку");
		}
	}
}

class Horizont extends MarkOfTV {

}

class WashingMachine {
	String nameWashingMachine = "Zanussi ";
	int powerСonsumption;

	public void consumption(int powerСonsumption) {
		this.powerСonsumption = powerСonsumption;
		System.out.println("Расход энергии " + powerСonsumption + " Кват/ч");
	}
}

class MarkOfWashingMachine extends WashingMachine {
	String name;

	public void push(String name) {
		if (name == "on" || name == "On") {
			System.out.println(nameWashingMachine + "Включён в розетку");
		} else if (name == "off" || name == "Off") {
			System.out.println(nameWashingMachine + "Выключен из розетки");
		} else {
			System.out.println("Нажми на кнопку");
		}
	}
}
		class Zanussi extends MarkOfWashingMachine {

		}
	

