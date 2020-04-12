package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	
	

	public BlackjackHand() {

	}

	public int getHandValue() {
		
		int x = 0;
		for (Card card : cards) {
			x += card.getValue();
		}
		return x;
		
		
	}

	public void isBlackjack() {
		if (player.getValue() == 21 && dealer.getValue() == 21) {
			System.out.println("********BLACKJACK PUSH*********");
		} else if (player.getValue() == 21) {
			System.out.println("********PLAYER BLACKJACK*********");
		} else if (dealer.getValue() == 21) {
			System.out.println("********DEALER BLACKJACK*********");
		}
		
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
