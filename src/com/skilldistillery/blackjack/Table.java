package com.skilldistillery.blackjack;

import java.util.Scanner;

public class Table {
	private Scanner input = new Scanner(System.in);
	Dealer deal = new Dealer();

	public void bjRules() {
		System.out.println(
				"*> If the player is dealt an Ace and a ten-value card (called a \"blackjack\" or \"natural\"), and the dealer does not, the player wins\n"
						+ "*> If the player exceeds a sum of 21 (\"busts\"); the player loses, even if the dealer also exceeds 21.\n"
						+ "*> If the dealer exceeds 21 (\"busts\") and the player does not; the player wins.\n"
						+ "*> If the player attains a final sum higher than the dealer and does not bust; the player wins.\n"
						+ "*> If both dealer and player receive a blackjack or any other hands with the same sum, called a \"push\", no one wins.\n\n\n");
		bankSetup();
	}

	public void bankSetup() {

		System.out.println("The table minimum bet is $1.00");
		System.out.println("How much money would you like to turn into chips? Whole numbers please");
		int playerMoney = input.nextInt();
		if (playerMoney <= 0) {
			System.out.println(" That is not enough capital to fund your Blackjack fun.  Try again....");
			bankSetup();
		} else if (playerMoney < 0) {
			System.out.println(" Great we will convert " + playerMoney + " to the Fools Casino chips");
			System.out.println(" Please enjoy your Blackjack Gaming responsibly");
			System.out.println(" If You or anyone you know has an issue with gambling please call 1-800-522-4700 Colorado's Hotline for responsible Gaming\n\n\n\n");
			deal.greetPlayer();
		} else {
			System.out.println("Hmmm something has gone wrong with your choice, please try again...\n\n\n");
			bankSetup();
		}
	}
}
