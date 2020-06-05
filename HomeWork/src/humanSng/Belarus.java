package humanSng;


public class Belarus extends HumanActions implements Human{
	String name;
	
	Belarus(String name){
		System.out.println(name);
		eat();
		friend();
	}
	public void eat() {	
		System.out.println( "Любит покушать драников!" );
	}
	@Override
	public void friend() {
		System.out.println("Беларусы мирные люди!");
		
	}
	
	public void printHumanInfo() {
		System.out.println("Я беларус!");
		sleep();
		run();
	}
	

}