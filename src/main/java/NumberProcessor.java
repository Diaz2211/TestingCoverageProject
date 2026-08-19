public class NumberProcessor {

    public String classifyNumbers(int[] numbers) {

        int positive = 0;
        int negative = 0;
        int zero = 0;


        // Vòng lặp
        for (int number : numbers) {

            // Lệnh rẽ nhánh
            if (number > 0) {
                positive++;

            } else if (number < 0) {
                negative++;

            } else {
                zero++;
            }
        }


        // Rẽ nhánh kết quả
        if (positive > negative) {

            return "Positive numbers are more";

        } else if (negative > positive) {

            return "Negative numbers are more";

        } else {

            return "Equal or zero dominant";
        }
    }
}
