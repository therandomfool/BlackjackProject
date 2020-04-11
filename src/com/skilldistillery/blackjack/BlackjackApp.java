package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackApp {
	private Table table = new Table();
	private Scanner input = new Scanner(System.in);
	boolean circle = false;

	public static void main(String[] args) {
		BlackjackApp bjApp = new BlackjackApp();

		bjApp.launch();
	}
// welcome to the fools Casino 

	public void launch() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("&&&&&&&&&&&& * * * *    Welcome to the Fool Casino  * * * * * &&&&&&&&&&&&&&&");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("==========>  where a fool and their money are soon parted  <=================");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("* * * + + +      Would you like to play some Blackjack?           + + + * * *");
		System.out.println("###########                                                       ###########");
		System.out.println("* * * + + +              [1] Y E S  [2] N O                       + + + * * *");
		System.out.println("###########                                                       ###########");
		System.out.println("###########                                                       ###########");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n\n");

		String casino = input.nextLine();

		while (circle = false) {
			switch (casino) {
			case "1":
				System.out.println("Great we have a table set up for you, please follow me....");
				table.bjRules();
			case "2":
				System.out.println(
						"Understandable!  Not everyone has the mental fortitude needed to succed at Blackjack");
				circle = true;
			default:

				System.out.println("Please enter either [1] or [2] as required");
				circle = false;
			}
		}
	}
}
