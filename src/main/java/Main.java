public class Main {

    public static void main(String[] args) {

        NumberCounter counter = new NumberCounter();

        int[] numbers = {1, 2, 3, 4, 5};

        String result = counter.countEvenOdd(numbers);

        System.out.println(result);
    }
}
