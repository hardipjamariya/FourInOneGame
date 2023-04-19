package com_ticTacToe;

import java.util.Scanner;

abstract class Game 
{
	static String[] board;
	static String turn;
	static String player;
	static Scanner in = new Scanner(System.in);
	
	abstract public String checkWinner();
	abstract public void printBoard();
	abstract public void gameMain(String player1, String player2);
	abstract public int computerInpute();
	abstract public void twoPlayerGame();
	abstract public void onePlayerGame();
}
