package task3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	    public static void main(String[] arg) {

	        ArrayList<User> peoplelist = new ArrayList<>();
	        peoplelist.add(new User("Леонардо", "Да Винчи", 50));
	        peoplelist.add(new User("Микеланджело", "Буонарроти", 55));
	        peoplelist.add(new User("Рафаэль", " Санти", 43));
	        peoplelist.add(new User("Франсуа ", "Рабле", 51));
	        peoplelist.add(new User("Томас", "Мор", 39));
	        peoplelist.add(new User("Ван", "Гог", 25));
	        peoplelist.add(new User("Эразм", "Роттердамский", 67));
	        peoplelist.add(new User("Ульрих", "Фон Гутен", 47));
	        peoplelist.add(new User("Иоган", "Гуттенберг", 85));
	        peoplelist.add(new User("Микеланджелло", "Бунаротти", 57));

	        File dir = new File("C:/Users/Admin/eclipse-workspace2/homework6/src/task3");
	        if (!dir.exists()) {
	            dir.mkdir();
	        }
	        String fileName = null;

	        for (User i : peoplelist) {
	            fileName = i.getName() + "_" + i.getFamily() + ".txt";
	            File file = new File(dir, fileName);
	            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
	                oos.writeObject(i);
	            } catch (IOException e) {
	                System.err.println(e.getMessage());
	            }
	        }
	    }
	}