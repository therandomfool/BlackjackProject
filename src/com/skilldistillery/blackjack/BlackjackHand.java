package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	Deck deck = new Deck();

	public BlackjackHand() {

	}

	public int getHandValue() {
		return 0;
		
	}

	public void isBlackjack() {
//		return getHandValue() == 21;
	}

	public boolean isBust() {
		return false;
//		 return getHandValue() > 21;

	}

	public boolean isHard() {
		return false;

	}

	public boolean isSoft() {
		return false;
	}

}
