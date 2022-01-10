package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class QueueOperation {

    /**
     * @param args
     * @throws IOException
     */
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

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            queue.offer(array[i]);
        }

        String line3 = br.readLine();
        int j = Integer.parseInt(line3);
        System.out.println(j);
        if (j == 1) {
            String line4 = br.readLine();
            int m = Integer.parseInt(line4);
            System.out.println(m);
            queue.offer(m);
        } else if (k == 0) {
            queue.remove();
        }

        System.out.println(queue.toArray().toString());

        for (Integer integer : queue) {
            System.out.println(integer);
        }

    }

}
