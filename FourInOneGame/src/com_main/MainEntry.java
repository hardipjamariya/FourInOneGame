package com_main;

import java.util.Scanner;

import com_quizGame.Quiz;
import com_randomNumberGuessing.RandomNumberGuessingGame;
import com_rockPaperScissor.RockPaperScissor;
import com_ticTacToe.TicTacToe;

public class MainEntry {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = sc.next();
		System.out.println("Hi "+name+", which game do you wish to play?");
		int ch = 0;
		while(ch!=5)
		{
			System.out.println("1. Number Guessing Game");
			System.out.println("2. Tic-Tac-Toe(X-O-X)");
			System.out.println("3. Quiz");
			System.out.println("4. Rock-Paper-Scissor");
			System.out.println("5. Exit");
			System.out.println("Enter your choice...");
			sc.nextLine();
			try{
				ch = sc.nextInt();
				gameSelection(ch);
			}
			catch(Exception e)
			{
				System.out.println("Enter a numeric input!");
				gameSelection(0);
			}	
		}
	}
	
	public static void gameSelection(int ch)
	{
		switch(ch)
		{
		case 1:
			System.out.println("Welcome to Random Number Guessing Game");
			RandomNumberGuessingGame g = new RandomNumberGuessingGame();
			g.gameplay();
			break;
		case 2:
			TicTacToe ttt = new TicTacToe();
			ttt.TicTacToeMain();
			System.out.println("\n");
			break;
		case 3:
			Quiz quiz = new Quiz();
	        quiz.begin();
	        System.out.println("\n");
			break;
		case 4:
			RockPaperScissor game = new RockPaperScissor();
			game.startGame();
			System.out.println("\n");
			break;
		case 5:
			System.out.println("Thank you for playing!!!");
			System.exit(0);
			System.out.println("\n");
			break;
		default:
			System.out.println("Invalid Choice...\n");
			//System.exit(0);
		}
	}
	
}
