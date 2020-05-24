package task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		File dir = new File("C:/Users/Admin/eclipse-workspace2/homework6/src/task4/task4");
		if (!dir.exists()) {
			dir.mkdir();
		}

		Random rand = new Random();

		String text = "";
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:/Users/Admin/eclipse-workspace2/homework6/src/task4/historyFile.txt"));) {
			while (reader.ready()) {
				text += reader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		try (FileWriter result = new FileWriter(new File(dir, "result.txt"), true);) {
			for (int i = 1; i < 100; i++) {
				File file = new File(dir, i + ".txt");
				int size = rand.nextInt(400);
				try (FileWriter writer = new FileWriter(file);) {
					writer.write(text.substring(0, size));
					result.write(file.getName() + " size : " + size + "\n");
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}
}