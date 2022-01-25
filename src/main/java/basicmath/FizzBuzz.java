package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
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
                if ((j % 3 == 0) && (j % 5 == 0)) {
                    System.out.println("FizzBuzz");
                } else if ((j % 3 == 0)) {
                    System.out.println("Fizz");
                } else if ((j % 5 == 0)) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}
