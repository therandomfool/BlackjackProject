package com.skilldistillery.blackjack;

import java.util.*;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<Card>();
	

	public Hand() {

	}

	public void addCard(Card card) {
		cards.add(card);

	}

	public void clear() {
//		cards.removeAll(getHand());
	}

	public int getHandValue(int x) {
		return x;

	}

	public void showHand() {
		int handTotal = 0;
		int cumaTotal = 0;
		for (Card card : cards) {
			System.out.println(card);
			System.out.println(card.getValue());
			cumaTotal = cumaTotal + (handTotal + card.getValue());
			
		}
		System.out.println(cumaTotal);
	}

}
