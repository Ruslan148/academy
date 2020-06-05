package humanSng;


public class Ukraine extends HumanActions implements Human{
	String name;

	Ukraine(String name) {
		System.out.println(name);
		eat();
		friend();
	}

	public void eat() {
		System.out.println("Любит сало!");
	}

	@Override
	public void friend() {
		System.out.println("Покажем, что мы, братья, казацкого роду!");

	}

	
	public void printHumanInfo() {
		System.out.println("Я украинец");
		sleep();
		run();
	}
}
