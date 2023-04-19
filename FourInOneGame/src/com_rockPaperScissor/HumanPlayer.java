package com_rockPaperScissor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer implements RPSPlayer {
	int choice;
	String choiceValue;
	Scanner sc = new Scanner(System.in);

	public String play() {
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.print("Select Your Choice : ");
		
		try {
			choice = sc.nextInt();
			choiceValue = CHOICES[choice - 1];

			System.out.println();
			return choiceValue;
		}catch (Exception e) {
			System.out.println("Invalid Input");
			return play();
		} 
	}
}