package com.skilldistillery.blackjack;

public abstract class Human {

	Hand hand = new BlackjackHand();

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
	
	public void getCard() {
		
	}
	
	 public void getHandValue() {
		 
	 }
}


