package humanSng;

public abstract class HumanActions{

	private String eat ="хавка";
	private int hours;
	private int kilometers;

	public void eat(String eat) {
		System.out.println(" Любит покушать" + eat);
	}
	public void eat() {
		System.out.println(" Любит покушать" );
	}

	public void sleep(int hours) {
		System.out.println("Спит " + hours + " часов в день.");
	}
	public void sleep() {
		System.out.println("Спит долго день.");
	}

	public void run(int kilometers) {
		System.out.println("Бегает " + kilometers + " в год.");
	}
	public void run() {
		System.out.println("Редко бегает");
	}
	public void howOldAreYou(int age) {
		System.out.println("Введи колличество лет");
	
		if(age < 35) {
			System.out.println(" Молодой");
			}
			else
			{
			System.out.println(" В возрасте");
		}
	}
	abstract public void friend();


}
