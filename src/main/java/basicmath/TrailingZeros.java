package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        if (n >= 1 && n <= 1000) {
            long fact = 1;
            while (n > 1) {
                fact = fact * n;
                System.out.println(fact);
                n--;
            }
            System.out.println(fact);
            int trailingZeros = 0;
            while (fact > 10) {
                if (fact % 10 == 0) {
                    trailingZeros++;
                }
                fact = fact / 10;
            }
            System.out.println(trailingZeros);
        }
    }

}
