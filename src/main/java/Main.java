public class Main {

    public static void main(String[] args) {

        NumberProcessor processor = new NumberProcessor();

        int[] numbers = {5, 8, -2, 0};

        String result =
                processor.classifyNumbers(numbers);

        System.out.println(result);
    }
}
