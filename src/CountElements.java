public class CountElements {

    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 7, -2, 4};

        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}