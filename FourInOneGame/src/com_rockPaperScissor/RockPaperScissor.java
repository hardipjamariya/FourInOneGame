package com_rockPaperScissor;

import java.util.Scanner;

public class RockPaperScissor {
	private static boolean playAgain() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Play again Y, N ? - ");

			switch (sc.next().charAt(0)) {
			case 'y':
				return true;
			case 'n':
				System.out.println("Exiting the game ....");
				return false;
			default:
				return playAgain();
			}
	}

	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		RPSPlayer computer = new RandomComputerPlayer();
		RPSPlayer human = new HumanPlayer();

		System.out.println("Welcome to Rock Paper Scissors Game\n");
		
		do {
			String comp = computer.play();
			String you = human.play();

			System.out.printf("%s vs. %s \n", comp, you);
			try {
			if (you.equals(comp)) {
				System.out.println("IT'S A TIE !! \n");
			} else if (("Rock".equals(you) && "Scissors".equals(comp))
					|| ("Scissors".equals(you) && "Paper".equals(comp))
					|| ("Paper".equals(you) && "Rock".equals(comp))) {
				System.out.println("!! You win !!\n");
			} else if (("Rock".equals(comp) && "Scissors".equals(you))
					|| ("Scissors".equals(comp) && "Paper".equals(you))
					|| ("Paper".equals(comp) && "Rock".equals(you))) {
				System.out.println("!! You lose !!\n");
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter the correct input");
			e.printStackTrace();
		}
		} while (playAgain());
		
	}
}

