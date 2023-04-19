package com_randomNumberGuessing;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame 
{
	Random num = new Random();
	Scanner scan = new Scanner(System.in);
	
	public void gameplay()
	{
		rules();
		System.out.println("Enter your level-1. Easy 2. Medium 3. Hard");
		int choice = scan.nextInt();
		level(choice);
	}
	
	public void rules() 
	{
		System.out.println("Here are some rules you need to know before starting your game..");
		System.out.println("1. You need to choose your level");
		System.out.println("2. Based on the level you will be given number of tries.");
		System.out.println("3. You have to guess the number in these number of tries only");
		System.out.println("4. After each try you will be given a hint whether the number is greater or smaller than the number you entered");
		System.out.println("Lets start playing by choosing your level");
		System.out.println("Here you go.....");
		
	}

	public void level(int choice)
	{
		
		if(choice == 1)
			game(2,10);
		if(choice == 2)
			game(3,25);
		if(choice == 3)
			game(5,100);
	}

	public void game(int t, int i) 
	{
		int n = num.nextInt(i);
		boolean result = false;
		System.out.println("You have "+t+" tries.");
		while(t > 0)
		{
			System.out.println("Enter a number between 0 to "+i);
			int num1 = scan.nextInt();
			
			if(num1 == n)
			{
				System.out.println("Congrats!! You win\n");
				result = true;
				break;
			}
			else if(num1 > n)
			{
				System.out.println("The number you entered is greater than the value");
			}
			else
			{
				System.out.println("The number you entered is less than the value");
			}
			t--;
		}
		if(t == 0 && result == false)
		{
			System.out.println("Oh!! You have no choices left!! Better luck next time!!");
			System.out.println("The number was "+n+"\n");
		}
				
	}
}

