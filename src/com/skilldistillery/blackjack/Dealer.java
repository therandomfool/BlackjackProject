package com.skilldistillery.blackjack;

import java.util.*;

public class Dealer extends Human {
//	public String playerHand = null;
	private Scanner input = new Scanner(System.in);
	Deck deck = new Deck();

	public void greetPlayer() {

		System.out.println("What name should I put on your Players card?");
		String player = input.nextLine();
		System.out.println("Greetings " + player + "!!");

//		System.out.println(" My name is " + dName + ". So glad you decided to join us here at the Fool Casino.  Good Luck");
		System.out.println("I will begin by shuffling the cards");
		deck.shuffle();

	}

	public Card dealCard() {

	return	deck.dealCard();
	}


	public void dealerStartHand() {

//		System.out.println("Hidden Card " + hand.showHand().get(1));
		
	}

	public void moneyHandle() {

	}



}