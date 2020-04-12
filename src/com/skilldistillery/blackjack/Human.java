package com.skilldistillery.blackjack;

public abstract class Human {

	protected Hand hand = new BlackjackHand();

	public int bet() {
		return 0;
	}

	public void handChoice() {

	}
	
	public void showHand() {
		hand.showHand();
	}
	
	public Hand getHand() {
		return hand;
	}
	
//	public void getCard() {
//		
//	}
}
