package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackApp {
	private Scanner input = new Scanner(System.in);
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	private BlackjackHand bjhand = new BlackjackHand();

	public static void main(String[] args) {
		BlackjackApp bjApp = new BlackjackApp();

		bjApp.launch();
	}
// welcome to the fools Casino 

	public void launch() {

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("&&&&&&&&&&&& * * * *   Welcome to the Fool Casino   * * * * * &&&&&&&&&&&&&&&");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("==========>  where a fool and their money are soon parted  <=================");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("* * * + + +      Would you like to play some Blackjack?           + + + * * *");
		System.out.println("###########                                                       ###########");
		System.out.println("* * * + + +              [1] Y E S  [2] N O                       + + + * * *");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n\n");

		int casino = input.nextInt();

		switch (casino) {
		case 1:
			System.out.println("Great we have a table set up for you, please follow me....");
			bjRules();
			break;
		case 2:
			System.out.println("Understandable!  Not everyone has the mental fortitude needed to succeed at Blackjack");
			break;
		default:

			System.out.println("Please enter either [1] or [2] as required");
			break;
		}
		dealer.greetPlayer();
		dealPlayerHand();
		dealDealerHand();
		System.out.println(player.getHand().getHandValue());
		System.out.println(dealer.getHand().getHandValue());
		bjhand.isBlackjack(); 

	}

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
		double playerMoney = input.nextDouble();
		if (playerMoney <= 0) {
			System.out.println(" That is not enough capital to fund your Blackjack fun.  Try again....");
			bankSetup();
		} else if (playerMoney > 0) {
			System.out.println(" Great we will convert " + playerMoney + " to the Fools Casino chips");
			System.out.println(" Please enjoy your Blackjack Gaming responsibly");
			System.out.println(
					" If You or anyone you know has an issue with gambling please call 1-800-522-4700 Colorado's Hotline for responsible Gaming\n\n\n\n");
//			dealer.greetPlayer();
		} else {
			System.out.println("Hmmm something has gone wrong with your choice, please try again...\n\n\n");
			bankSetup();

		}
	}

	public void dealPlayerHand() {
		player.getHand().addCard(dealer.dealCard());
		player.getHand().addCard(dealer.dealCard());
		System.out.println("Player Hand****************");
		player.showHand();

	}

	public void dealDealerHand() {
		dealer.getHand().addCard(dealer.dealCard());
		dealer.getHand().addCard(dealer.dealCard());
		System.out.println("Dealer Hand----------------");
		dealer.showHand();

	}

//	public void initialBJ() {
//		if (player.getValue() == 21 && dealer.getValue() == 21) {
//			System.out.println("********BLACKJACK PUSH*********");
//		} else if (player.getValue() == 21) {
//			System.out.println("********PLAYER BLACKJACK*********");
//		} else if (dealer.getValue() == 21) {
//			System.out.println("********DEALER BLACKJACK*********");
//		}
//		gameLogic();
//	}
	
	public void gameLogic() {
		
	}
}
