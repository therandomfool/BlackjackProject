package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackHand extends Hand {
	Scanner input = new Scanner(System.in);

	public BlackjackHand() {

	}

	public int getHandValue() {

		int x = 0;
		for (Card card : cards) {
			x += card.getValue();
		}
		return x;

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
