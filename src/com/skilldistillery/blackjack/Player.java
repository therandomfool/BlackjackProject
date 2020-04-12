package com.skilldistillery.blackjack;

public class Player extends Human {

	public void continueOn() {

	}

	public void addCard(Card card) {
		hand.addCard(card);
		
	}

	public int getValue() {
		return hand.getHandValue();
		
	}
	



}
