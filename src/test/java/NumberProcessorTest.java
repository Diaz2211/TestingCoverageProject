import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCounterTest {

    @Test
    public void testEvenAndOdd() {

        NumberCounter counter = new NumberCounter();

        int[] numbers = {1, 2, 3, 4};

        String result = counter.countEvenOdd(numbers);

        assertEquals("Even: 2, Odd: 2", result);
    }

    @Test
    public void testAllEven() {

        NumberCounter counter = new NumberCounter();

        int[] numbers = {2, 4, 6};

        String result = counter.countEvenOdd(numbers);

        assertEquals("Even: 3, Odd: 0", result);
    }

    @Test
    public void testAllOdd() {

        NumberCounter counter = new NumberCounter();

        int[] numbers = {1, 3, 5};

        String result = counter.countEvenOdd(numbers);

        assertEquals("Even: 0, Odd: 3", result);
    }
}
