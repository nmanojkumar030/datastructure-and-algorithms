package practice.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentElements {
    public static void main(String[] args) {
        int[] integerArray = {6, 6, 6, 7, 7, 9};
        int k = 2;

        Arrays.stream(findKMostFrequentElements(integerArray, k)).forEach(System.out::println);
        Arrays.stream(findKMostFrequentElementsUsingPriorityQueue(integerArray, k)).forEach(System.out::println);
        Arrays.stream(findKMostFrequentElementsUsingStreams(integerArray, k)).forEach(System.out::println);
    }

    private static int[] findKMostFrequentElements(int[] integerArray, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : integerArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((n1, n2) -> map.get(n2) - map.get(n1));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keyList.get(i);
        }
        return result;
    }

    private static int[] findKMostFrequentElementsUsingPriorityQueue(int[] integerArray, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : integerArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> map.get(num2) - map.get(num1));
        for (int key : map.keySet()) {
            queue.offer(key);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    private static int[] findKMostFrequentElementsUsingStreams(int[] integerArray, int k) {
        return Arrays.stream(integerArray)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted((a, b)-> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
