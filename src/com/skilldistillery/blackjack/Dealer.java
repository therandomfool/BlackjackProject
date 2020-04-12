package com.skilldistillery.blackjack;

import java.util.*;

public class Dealer extends Human {
//	private Player player = new Player();
	
	private BlackjackHand hand = new BlackjackHand();
	private Deck deck = new Deck();

	private Scanner input = new Scanner(System.in);

	public void greetPlayer() {

		System.out.println("What name should I put on your Players card?");
		String player = input.nextLine();
		System.out.println("Greetings " + player + "!!");

//		System.out.println(" My name is " + dName + ". So glad you decided to join us here at the Fool Casino.  Good Luck");
		System.out.println("I will begin by shuffling the cards");
		deck.shuffle();

	}

	public Card dealCard() {

		return deck.dealCard();
	}



	

	public void moneyHandle() {

	}
	
	public int getValue() {
		return hand.getHandValue();
		
	}

}
