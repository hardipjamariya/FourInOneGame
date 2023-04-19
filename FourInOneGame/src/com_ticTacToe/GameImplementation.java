package com_ticTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class GameImplementation extends Game {

	public String checkWinner() 
	{
		for (int a = 0; a < 8; a++) {
			String line = null;
			String winner = "";
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			}

			else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8) {
				return "draw";
			}
		}

		if (player.equalsIgnoreCase("Computer"))
			System.out.println(player + " turn;");
		else
			System.out.println(player + " turn; enter a slot number to place " + turn + " in:");
		return null;
	}
	
	
	public void printBoard() 
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}
	
	
	public void gameMain(String player1, String player2) {
		board = new String[9];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) 
		{
			board[a] = String.valueOf(a + 1);
		}
		System.out.println("Welcome to 3x3 Tic Tac Toe.");
		printBoard();
		System.out.println(player1 + " will play first. Enter a slot number to place X in:");
		int numInput = 0;
		player = player1;
		while (winner == null) {
			try {
				if (player.equalsIgnoreCase("Computer")) {
					numInput = computerInpute();
				} 
				else
					numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) 
				{
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid input; re-enter slot number:");
				in.next();
				continue;
			}

			if (board[numInput - 1].equals(String.valueOf(numInput))) 
			{
				board[numInput - 1] = turn;
				if (turn.equals("X")) {
					turn = "O";
					player = player2;
				} else 
				{
					turn = "X";
					player = player1;
				}

				printBoard();
				winner = checkWinner();
			}
			else if (player.equalsIgnoreCase("Computer")) {
			}
			else
				System.out.println("Slot already taken; re-enter slot number:");
		}

		String player = (winner == "X") ? player1 : player2;
		if (winner.equalsIgnoreCase("draw")) {

			System.out.println("It's a draw! Thanks for playing.");
		}

		else {
			System.out.println("Congratulations! " + player + " have won! Thanks for playing.");
		}
	}
	

	public int computerInpute() 
	{
		Random random = new Random();
		return random.nextInt(9) + 1;
	}


	public void twoPlayerGame() {
		System.out.println("Enter Player 1 Names");
		String player1 = in.next();
		System.out.println("Enter Player 2 Name");
		String player2 = in.next();
		gameMain(player1, player2);
		
	}


	public void onePlayerGame() 
	{
		System.out.println("Enter Your Name");
		String player1 = in.next();
		gameMain(player1, "Computer");
		
	}
		
}
