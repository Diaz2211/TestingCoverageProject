public class NumberCounter {

    public String countEvenOdd(int[] numbers) {
        int even = 0;
        int odd = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return "Even: " + even + ", Odd: " + odd;
    }
}
