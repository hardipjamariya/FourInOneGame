package com_rockPaperScissor;

import java.util.Random;

public class RandomComputerPlayer implements RPSPlayer 
{
    private final Random random = new Random();

    public String play() {
        return CHOICES[this.random.nextInt(CHOICES.length)];
    }
}