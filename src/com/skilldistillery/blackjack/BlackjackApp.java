package com.skilldistillery.blackjack;

//import java.util.Scanner;

public class BlackjackApp {
//	private Scanner input = new Scanner(System.in);
//	private Player player = new Player();
//	private Dealer dealer = new Dealer();

	int count = 0;
	boolean cont = true;

	public static void main(String[] args) {
//		BlackjackApp bjApp = new BlackjackApp();
		playFlow pflow = new playFlow();

		pflow.launch();
	}
// welcome to the fools Casino 

//	public void launch() {
//
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println("###########                                                       ###########");
//		System.out.println("###########                                                       ###########");
//		System.out.println("&&&&&&&&&&&& * * * *   Welcome to the Fool Casino   * * * * * &&&&&&&&&&&&&&&");
//		System.out.println("###########                                                       ###########");
//		System.out.println("###########                                                       ###########");
//		System.out.println("==========>  where a fool and their money are soon parted  <=================");
//		System.out.println("###########                                                       ###########");
//		System.out.println("###########                                                       ###########");
//		System.out.println("* * * + + +      Would you like to play some Blackjack?           + + + * * *");
//		System.out.println("###########                                                       ###########");
//		System.out.println("* * * + + +              [1] Y E S  [2] N O                       + + + * * *");
//		System.out.println("###########                                                       ###########");
//		System.out.println("###########                                                       ###########");
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n\n");
//
//		int casino = input.nextInt();
//
//		switch (casino) {
//		case 1:
//			System.out.println("Great we have a table set up for you, please follow me....");
//			bjRules();
//			break;
//		case 2:
//			System.out.println("Understandable!  Not everyone has the mental fortitude needed to succeed at Blackjack");
//			System.exit(0);
//		default:
//
//			System.out.println("Please enter either [1] or [2] as required");
//			break;
//		}
//		dealer.greetPlayer();
//		firstHand();
//	}
//
//	public void firstHand() {
//		count = 0;
//		dealer.getHand().clear();
//		player.getHand().clear();
//		System.out.println("<-------> READY FOR NEXT HAND ? ? ? <------------->");
//		System.out.println("<------------>   <1> YES   <9> NO   <------------->");
//		int kb = input.nextInt();
//		if (kb != 1) {
//			System.out.println("\n\n\nGoodbye!!");
//			System.exit(0);
//		}
//		System.out.println("\n\n\n\n<---------- NEW HAND <------------->\n\n");
//		dealHandPlural();
//		initialBJ();
//		count++;
//		playerHandLogic();
//	}
//
////	public void launchHand() {
////
////		count++;
////		dealHandPlural();
//////		System.out.println(player.getHand().getHandValue());
//////		System.out.println(dealer.getHand().getHandValue());
////		playerHandLogic();
////		launchHand();
////
////	}
//
//	public void bjRules() {
//		System.out.println(
//				"*> If the player is dealt an Ace and a ten-value card (called a \"blackjack\" or \"natural\"), and the dealer does not, the player wins\n"
//						+ "*> If the player exceeds a sum of 21 (\"busts\"); the player loses, even if the dealer also exceeds 21.\n"
//						+ "*> If the dealer exceeds 21 (\"busts\") and the player does not; the player wins.\n"
//						+ "*> If the player attains a final sum higher than the dealer and does not bust; the player wins.\n"
//						+ "*> If both dealer and player receive a blackjack or any other hands with the same sum, called a \"push\", no one wins.\n\n\n");
//		bankSetup();
//	}
//
//	public void bankSetup() {
//
//		System.out.println("The table minimum bet is $1.00");
//		System.out.println("How much money would you like to turn into chips? Whole numbers please");
//		double playerMoney = input.nextDouble();
//		if (playerMoney <= 0) {
//			System.out.println(" That is not enough capital to fund your Blackjack fun.  Try again....");
//			bankSetup();
//		} else if (playerMoney > 0) {
//			System.out.println(" Great we will convert " + playerMoney + " to the Fools Casino chips");
//			System.out.println(" Please enjoy your Blackjack Gaming responsibly");
//			System.out.println(
//					" If You or anyone you know has an issue with gambling please call 1-800-522-4700 Colorado's Hotline for responsible Gaming\n\n\n\n");
////			dealer.greetPlayer();
//		} else {
//			System.out.println("Hmmm something has gone wrong with your choice, please try again...\n\n\n");
//			bankSetup();
//
//		}
//	}
//
//	public void dealHandPlural() {
//		dealPlayerHand();
//		dealDealerHand();
//	}
//
//	public void dealPlayerHand() {
//		player.getHand().addCard(dealer.dealCard());
//		player.getHand().addCard(dealer.dealCard());
//		System.out.println("Player Hand****************\n");
//		player.showHand();
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//
//	}
//
//	public void dealDealerHand() {
//		dealer.getHand().addCard(dealer.dealCard());
//		System.out.println("Dealer Hand----------------\n");
//		dealer.showHand();
//		dealer.getHand().addCard(dealer.dealCard());
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//
//	}
//
//	public void initialBJ() {
//		if (player.getValue() == 21 && dealer.getValue() == 21) {
//			System.out.println("\t\t********BLACKJACK PUSH*********\n\n");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			firstHand();
//
//		} else if (player.getValue() == 21) {
//			System.out.println("\t\t********PLAYER BLACKJACK*********\n\n");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			firstHand();
//		} else if (dealer.getValue() == 21) {
//			System.out.println("\t\t********DEALER BLACKJACK*********\n\n");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			firstHand();
//		}
//	}
//
//	public void playerHandLogic() {
//
//		System.out.println("*************************************************************************************");
////		System.out.println(player.getHand().getHandValue() + "\n");
//		while (cont = true) {
//
//			System.out.println(("Your Hand totals: " + player.getHand().getHandValue() + "---->[1] HOLD  [9] HIT IT"));
//			int kb = input.nextInt();
//			if (kb == 1) {
//				dealerHandLogic();
//				bustHand();
//				compareHands();
//				cont = false;
//			} else if (kb == 9) {
////				System.out.println("Your hit card is: " + );
//				player.getHand().addCard(dealer.dealCard());
//				player.showHand();
//				bustHand();
//				playerHandLogic();
////				compareHands();
//				cont = false;
//			} else {
//				cont = true;
//			}
//		}
////		switch (player.getHand().getHandValue()) {
////		case 21:
////		case 20:
////		case 19:
////		case 18:
////		case 17:
////			System.out.println("Your Hand totals: " + player.getHand().getHandValue() + "Player Stays on: "
////					+ player.getHand().getHandValue());
////			dealerHandLogic();
////		case 16:
////		case 15:
////		case 14:
////		case 13:
////		case 12:
////		case 11:
////		case 10:
////		case 9:
////		case 8:
////		case 7:
////		case 6:
////		case 5:
////		case 4:
////		case 3:
////			playerHitHoldLogic();
//
//	}
//
////	public void playerHitHoldLogic() {
////		while (cont = true) {
////
////			System.out.println(("Your Hand totals: " + player.getHand().getHandValue() + "---->[1] HOLD  [9] HIT IT"));
////			int kb = input.nextInt();
////			if (kb == 1) {
////				dealerHandLogic();
////				bustHand();
////				compareHands();
////				cont = false;
////			} else if (kb == 9) {
//////				System.out.println("Your hit card is: " + );
////				player.getHand().addCard(dealer.dealCard());
////				player.showHand();
////				playerHandLogic();
////				bustHand();
////				compareHands();
////				cont = false;
////			} else {
////				cont = true;
////			}
////		}
////
////	}
//
//	public void dealerHandLogic() {
//		System.out.println(dealer.getHand().getHandValue() + "\n");
//		switch (dealer.getHand().getHandValue()) {
//		case 21:
//		case 20:
//		case 19:
//		case 18:
//		case 17:
//			System.out.println("DEALER Hand totals: " + dealer.getHand().getHandValue() + "DEALER Stays on: "
//					+ dealer.getHand().getHandValue());
//			compareHands();
//		case 16:
//		case 15:
//		case 14:
//		case 13:
//		case 12:
//		case 11:
//		case 10:
//		case 9:
//		case 8:
//		case 7:
//		case 6:
//		case 5:
//		case 4:
//		case 3:
//			dealerHitHoldLogic();
//
//		}
//	}
//
//	public void dealerHitHoldLogic() {
//		dealer.getHand().addCard(dealer.dealCard());
//		dealer.showHand();
//		bustHand();
//		dealerHandLogic();
//	}
//
//	public void compareHands() {
//		if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
//			System.out.println("DEALER WINS");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			System.out.println("**********************************");
//
//			firstHand();
//		} else if (player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
//			System.out.println("PLAYER WINS");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			System.out.println("**********************************");
//
//			firstHand();
//		} else {
//			System.out.println("Pushy Pushy");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			System.out.println("**********************************");
//
//			firstHand();
//		}
//	}
//
//	public void bustHand() {
//		if (player.getHand().getHandValue() > 21) {
//			System.out.println("Player <------------> BUSTED");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			System.out.println("Dealer Wins");
//
//			firstHand();
//		} else if (dealer.getHand().getHandValue() > 21) {
//			System.out.println("DEALER <------------> BUSTED");
//			System.out.println("PLAYER HAND" + player.getHand().getHandValue());
//			System.out.println("DEALER HAND" + dealer.getHand().getHandValue());
//			System.out.println("PLAYER Wins");
//			firstHand();
//		}
//	}

}
