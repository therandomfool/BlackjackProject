package com.skilldistillery.blackjack;

import java.util.*;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<Card>();
	static Player player = new Player();
	static Dealer dealer = new Dealer();
	

	public Hand() {

	}

	public void addCard(Card card) {
		cards.add(card);

	}

	public void clear() {
//		cards.removeAll(getHand());
	}

	public abstract int getHandValue();	
	

	public void showHand() {
			System.out.println(cards);

	}

}
