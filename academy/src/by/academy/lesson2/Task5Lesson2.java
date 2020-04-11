package by.academy.lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Task5Lesson2 {

			// Complete the pairs function below.
			static int pairs(int k, int[] arr) {   
				int pairsCount = 0;							// переменная колличество пар
				for (int x = 0; x < arr.length; x++ ) {		// внешний цикл, который проходит по всем элементам массива
					for (int y = 0; y < arr.length; y++) {	// внутренний цикл, который проходит по всем элементам массива
						if (arr[x] - arr[y] == k) {			// условие, где разность должна равняться переменной k
							pairsCount = pairsCount + 1;	// увеличение счётчика на 1
						}
					}
				}
				
				return pairsCount;							// возврат счётчика
			}

			private static final Scanner scanner = new Scanner(System.in);

			public static void main(String[] args) throws IOException {

				String[] nk = scanner.nextLine().split(" ");

				int n = Integer.parseInt(nk[0]);

				int k = Integer.parseInt(nk[1]);

				int[] arr = new int[n];

				String[] arrItems = scanner.nextLine().split(" ");

				for (int i = 0; i < n; i++) {
					arr[i] = Integer.parseInt(arrItems[i]);
					System.out.println(arr[i]);
				}

				int result = pairs(k, arr);
				System.out.println(result);

				scanner.close();
	
	}

}
