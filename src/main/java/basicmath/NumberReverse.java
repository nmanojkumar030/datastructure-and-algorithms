package basicmath;

public class NumberReverse {

    public int reverseNumber(int number) {
        int reverse = 0;
        while (number >= 1 && number <= 10000) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String a[]) {
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: " + nr.reverseNumber(100));
    }
}
