package by.academy.lesson2;

public class ShortTextTask5Les3 {

	public static void main(String[] args) {
		String text = "Создать класс и объекты описывающие Банкомат. Набор купюр находящихся\r\n"
				+ "в банкомате должен задаваться тремя свойствами: количеством купюр номиналом\r\n"
				+ "20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию\r\n"
				+ "снимающую деньги. На вход передается сумма денег. На выход – булевское\r\n"
				+ "значение (операция удалась или нет). При снятии денег функция должна\r\n"
				+ "рапечатывать каким количеством купюр какого номинала выдается сумма. Создать\r\n"
				+ "конструктор с тремя параметрами – количеством купюр. Прочее – на ваше\r\n" + "усмотрение.\r\n" + "";
		System.out.println(text);
		text = text.replaceAll("[!.,:;-]", "");

		String[] words = text.split(" ");
		StringBuilder shortText = new StringBuilder();

		for (String word : words) {
			shortText.append(word.charAt(word.length() - 1));
		}

		System.out.println("Result - " + shortText);
	}

}
