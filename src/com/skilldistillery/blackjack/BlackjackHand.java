package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	Deck deck = new Deck();
	int cumaTotal = 0;
	int handTotal = 0;

	public BlackjackHand() {

	}

	public int getHandValue() {
		for (Card card : cards) {
			System.out.println(card);
			System.out.println(card.getValue());
			handTotal = card.getValue();
			cumaTotal += handTotal;
		}
		return cumaTotal;
		
	}

	public void isBlackjack() {
//		if (deck.cd == 2 && cumaTotal ==21) {
//			System.out.println("********BLACKJACK*********");
//		}
//		deck.cd=0;
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
