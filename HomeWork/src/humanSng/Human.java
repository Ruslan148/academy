package humanSng;

//Создать единый класс человеку с конструкторами с методами и полями разными типами.
//Реализовать в этом классе метод  printHumanInfo(). Придумать поля и методы сложные.
//Создать несколько дочерних классов у которых нужно будет переопределять разные методы 
//и добавлять дополнительные поля. Обязательно переопределить printHumanInfo
//Сделать так чтобы в каком нибудь классе были перегружены методы.
//СОздать в главном методе массив типа Human, создать разные объекты разных классов с разными данными.
//Создать общий метод который будет принимать на вход массив Human и вызывать для каждого элемента массива
//PrintHumanInfo. 
public interface Human {
/**
* выводит в консоль всю информацию о человеке.
*/
	public void printHumanInfo();


	
}