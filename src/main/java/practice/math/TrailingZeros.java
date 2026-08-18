package practice.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        if (n >= 1 && n <= 1000) {
            long fact = factorial(n);
            System.out.println(fact);
            System.out.println(countTrailingZeros(fact));
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        while (n > 1) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static int countTrailingZeros(long fact) {
        int trailingZeros = 0;
        while (fact > 0 && fact % 10 == 0) {
            trailingZeros++;
            fact = fact / 10;
        }
        return trailingZeros;
    }

}
