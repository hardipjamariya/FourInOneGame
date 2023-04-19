package com_quizGame;

import java.util.Scanner;

public class Quiz {
	public void begin() {
		rules();
		Question[] questions = new Question[5];

		questions[0] = new Question("Which of the following is not a Java features?", "Dynamic", "Architecture Neutral",
				"Use of pointers", "Object-oriented", new Answer("Use of pointers"));
		questions[1] = new Question(" _____ is used to find and fix bugs in the Java programs?", "JVM", "JRE", "JDK",
				"JDB", new Answer("JDB"));
		questions[2] = new Question("Which package contains the Random class?", "java.util package",
				"java.lang package", "java.awt package", "java.io package", new Answer("java.util package"));
		questions[3] = new Question(" In java, jar stands for_____.", "Java Archive Runner",
				"Java Application Resource", "Java Application Runner", "None of the above",
				new Answer("None of the above"));
		questions[4] = new Question("What is the initial quantity of the ArrayList list?", "5", "10", "0", "100",
				new Answer("10"));

		int countTotal = 0;
		int countRight = 0;
		int countWrong = 0;

		for (Question q : questions) {
			System.out.println(q.getQuestion());
			System.out.println("A : " + q.getOption1());
			System.out.println("B : " + q.getOption2());
			System.out.println("C : " + q.getOption3());
			System.out.println("D : " + q.getOption4());

			String answer = "";

			char ans;
			System.out.println("Enter your answer");
			Scanner scan = new Scanner(System.in);
			ans = scan.next().charAt(0);

			switch (Character.toUpperCase(ans)) {
			case 'A':
				answer = q.getOption1();
				break;
			case 'B':
				answer = q.getOption2();
				break;
			case 'C':
				answer = q.getOption3();
				break;
			case 'D':
				answer = q.getOption4();
				break;
			default:
				break;
			}
			System.out.println("---------------------------------------------------------");
			if (answer.equals(q.getAnswer().getAnswer())) {
				System.out.println("Your answer " + answer + " is CORRECT");
				countRight++;
			} else {
				System.out.println("Your answer " + answer + " is WRONG");
				System.out.println("Correct Answer: " + q.getAnswer().getAnswer());
				countWrong++;
			}
			System.out.println("---------------------------------------------------------");
			countTotal++;
		}

		Result result = new Result(countTotal, countRight, countWrong);
		result.showResult();
	}

	public void rules() {
		System.out.println("Welcome to quiz game.");
		System.out.println("Here are some rules you need to know before starting your game..");
		System.out.println("1. You will be given a question and four options related to it");
		System.out.println("2. You need to enter the correct option");
		System.out.println("3. The number of correct answers will be counted");
		System.out.println("4. At last you will be given your percentage score and your performance");
		System.out.println("Lets start playing");
		System.out.println("Here you go.....\n");
	}

}
