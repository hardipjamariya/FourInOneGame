package com_quizGame;

public class Result implements IResult {
	private int totalQuestions;
	private int correctAnswers;
	private int wrongAnswers;

	public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
	}

	@Override
	public void showResult() {
		System.out.println("Your results!");
		System.out.println("Total Questions " + totalQuestions);
		System.out.println("Number of correct answers " + correctAnswers);
		System.out.println("Number of wrong answers " + wrongAnswers);
		System.out.println("Percentage " + showPercentage(correctAnswers, totalQuestions));
		System.out.println("Your performance is " + showPerformance(showPercentage(correctAnswers, totalQuestions)));

	}

	@Override
	public double showPercentage(int correctAnswers, int totalQuestions) {
		return (double) (correctAnswers / (double) totalQuestions) * 100;
	}

	@Override
	public String showPerformance(double percentage) {
		String performance = "";

		if (percentage >= 70) {
			performance = "Good";
		} else if (percentage >= 40) {
			performance = "Average";
		} else {
			performance = "Poor";
		}

		return performance;

	}

}
