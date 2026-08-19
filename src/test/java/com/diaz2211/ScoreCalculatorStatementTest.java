package com.diaz2211;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ScoreCalculatorStatementTest {
    @Test
    void shouldExecuteBothBranchesAndReturnTotal() {
        ScoreCalculator calculator = new ScoreCalculator();
        assertEquals(110, calculator.calculateScore(new int[]{60, 40}));
    }
}
