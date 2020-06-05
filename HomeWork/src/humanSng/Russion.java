package humanSng;

public class Russion extends HumanActions implements Human {
	String name;

	Russion(String name) {
		System.out.println(name);
		eat();
		friend();
	}

	public void eat() {
		System.out.println("Любит водку!");
	}

	@Override
	public void friend() {
		System.out.println("Предками данная мудрость народная!\r\n" + "Славься, страна! Мы гордимся тобой!");

	}

	
	public void printHumanInfo() {
		System.out.println("Я русский!");
		sleep();
		run();
	}
}