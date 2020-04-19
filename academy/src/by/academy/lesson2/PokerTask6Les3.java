package by.academy.lesson2;

import java.util.Random;

public class PokerTask6Les3 {
	public static void main(String[] args) {

		System.out.println();
		String[] deck = new String[52];
		String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A" };
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {

			String[] lear = { " Ч", " П", " К", " Б" };
			for (int j = 0; j < lear.length; j++) {
				deck[count] = lear[j] + numbers[i];
				count = count + 1;
			}
		}
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i]);
		}
		System.out.println(" ");
		String[] player1 = new String[5];
		for (int x = 0; x < player1.length; x++) {
			Random rnd = new Random();
			player1[x] = deck[rnd.nextInt(51)];
			System.out.print(player1[x] + " ");
		}
		System.out.println(" ");
		String[] player2 = new String[5];
		for (int x = 0; x < player2.length; x++) {
			Random rnd = new Random();
			player2[x] = deck[rnd.nextInt(51)];
			System.out.print(player2[x] + " ");
		}
	}
}