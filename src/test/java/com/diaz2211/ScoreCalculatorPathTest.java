package com.diaz2211;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ScoreCalculatorPathTest {
    private final ScoreCalculator calculator = new ScoreCalculator();

    @Test
    void pathWithZeroIterations() {
        assertEquals(0, calculator.calculateScore(new int[]{}));
    }

    @Test
    void pathWithOneIterationIfBranch() {
        assertEquals(60, calculator.calculateScore(new int[]{60}));
    }

    @Test
    void pathWithOneIterationElseBranch() {
        assertEquals(10, calculator.calculateScore(new int[]{40}));
    }

    @Test
    void pathIfThenElse() {
        assertEquals(70, calculator.calculateScore(new int[]{60, 40}));
    }

    @Test
    void pathElseThenIf() {
        assertEquals(70, calculator.calculateScore(new int[]{40, 60}));
    }

    @Test
    void pathIfThenIf() {
        assertEquals(140, calculator.calculateScore(new int[]{60, 80}));
    }

    @Test
    void pathElseThenElse() {
        assertEquals(20, calculator.calculateScore(new int[]{40, 30}));
    }
}
