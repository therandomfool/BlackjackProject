package com.skilldistillery.blackjack;

import java.util.Scanner;

public class Dealer extends Human{
private Scanner input = new Scanner(System.in);
	String dName = "";
	
	public void greetPlayer(){
		System.out.println("What name should I put on your Players card?");
		String player = input.nextLine();
		System.out.println("Greetings " + player + "So glad you decided to join us here at the Fool Casino.  Good Luck");
		
	}
	
	public void dealCard() {
		
	}
	
	public void moneyHandle(){
		
	}
	
	public void dealerName() {
		double randName = (Math.round((Math.random() * 10) + 1));
		int counterName = (int) randName;
		switch(counterName) {
		case 1:
			dName = "Sammy";
			break;
		case 2:
			dName = "Bart";
			break;
		case 3:
			dName = "Zhang Wei";
			break;
		case 4:
			dName = "Devon";
			break;
		case 5:
			dName = "Akemi";
			break;
		case 6:
			dName = "Sammy";
			break;
		case 7:
			dName = "Sammy";
			break;
		case 8:
			dName = "Alvita";
			break;
		case 9:
			dName = "Wang Fang";
			break;
		case 10:
			dName = "Aiko";
			break;
			
		}
		
	}
}
