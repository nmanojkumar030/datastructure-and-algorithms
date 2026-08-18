package practice.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzz {

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int n = Integer.parseInt(line1);
        int array[] = new int[n];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int k = 0;
        while (stringTokenizer.hasMoreTokens()) {
            array[k++] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i]; j++) {
                System.out.println(fizzBuzzValue(j));
            }
        }
    }

    public static String fizzBuzzValue(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
