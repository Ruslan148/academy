package homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
        File historyFile = new File("C:/Users/Admin/eclipse-workspace2/homework6/src/homework6/historyFile.txt");
        File result = new File("C:/Users/Admin/eclipse-workspace2/homework6/src/homework6/result.txt");
		try (FileWriter writer = new FileWriter(result);
				BufferedReader reader = new BufferedReader(new FileReader(historyFile))) {
			while(reader.ready()) {
				String line = reader.readLine();
				line = line.replaceAll(" ", "");
				writer.write(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Не найден ");
		} catch (IOException e1) {
			System.out.println("IOException.");
		}

	}

}
