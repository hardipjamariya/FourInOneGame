package com_ticTacToe;

import java.util.Scanner;

public class TicTacToe
{
	public void  TicTacToeMain() 
	{
		GameImplementation game = new GameImplementation();
		int gameType = 0;
		Scanner in = new Scanner(System.in);
		while(gameType != 3)
		{
			System.out.println("Select Game Type\nEnter\n1 for One Player Game\n2 for Two Player Game\n3 for Exit");
			
			try
			{
				gameType = in.nextInt();
			}
			catch(Exception e)
			{
				in.nextLine();
				System.out.println("Please enter a number!!\n");
				continue;
			}
			switch (gameType) 
			{
				case 1:
					game.onePlayerGame();
					break;
				case 2:
					game.twoPlayerGame();
					break;
				case 3:
					System.out.println("Thanks for Playing!");
					break;
				default:
					System.out.println("Invalid Choice Try Again\n");
					break;
			}
			if(gameType==1 || gameType==2){
			System.out.println("\nWant to play again?");
			System.out.println("Enter 1 for Yes and 2 for No: ");
			while(true)
			{
				try
				{
					int choice=in.nextInt();
					if(choice==2)
					{
						System.out.println("Thanks for Playing!");
						return;
					}
					else if(choice==1)
					{
						break;
					}
					else
					{
						System.out.println("Please enter either 1(Yes) or 2(No)!");
					}
				}
				catch(Exception e)
				{
					in.nextLine();
					System.out.println("Please enter either 1(Yes) or 2(No)!");
				}
			
			}
			}
			
		}

	}
}
