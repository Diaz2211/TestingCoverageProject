import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberProcessorTest {


    @Test
    public void testPositiveStatement() {

        NumberProcessor processor =
                new NumberProcessor();

        int[] numbers = {1, 2, -1};


        String result =
                processor.classifyNumbers(numbers);


        assertEquals(
            "Positive numbers are more",
            result
        );
    }



    @Test
    public void testNegativeStatement() {

        NumberProcessor processor =
                new NumberProcessor();


        int[] numbers = {-1, -2, 3};


        String result =
                processor.classifyNumbers(numbers);


        assertEquals(
            "Negative numbers are more",
            result
        );
    }



    @Test
    public void testZeroStatement() {

        NumberProcessor processor =
                new NumberProcessor();


        int[] numbers = {0,0};


        String result =
                processor.classifyNumbers(numbers);


        assertEquals(
            "Equal or zero dominant",
            result
        );
    }



    @Test
    public void testEqualStatement() {

        NumberProcessor processor =
                new NumberProcessor();


        int[] numbers = {1,-1};


        String result =
                processor.classifyNumbers(numbers);


        assertEquals(
            "Equal or zero dominant",
            result
        );
    }
}
