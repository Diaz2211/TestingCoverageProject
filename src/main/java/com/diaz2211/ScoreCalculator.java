package com.diaz2211;

public class ScoreCalculator {
    public int calculateScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            if (score >= 50) {
                total += score;
            } else {
                total += 10;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] scores = {45, 60, 80};
        System.out.println(new ScoreCalculator().calculateScore(scores));
    }
}
