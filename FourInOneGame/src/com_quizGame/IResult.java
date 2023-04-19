package com_quizGame;

public interface IResult
{
	void showResult();
    double showPercentage(int correctAnswers,int totalQuestions);
    String showPerformance(double percentage);
}
