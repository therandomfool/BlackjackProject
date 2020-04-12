package com.skilldistillery.blackjack;

import java.util.*;

public abstract class Hand {
	private List<Card>  cards = new ArrayList<Card>();
	
	
	public void addCard(Card card) {
		cards.add(card);
		
	}
	
	public void clear() {
		
	}
	
	public void getHandValue(int x) {
		
	}

	public void showHand() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}
	
}
