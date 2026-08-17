package practice.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElements {
    static void main(String[] args) {
        int[] integerArray = {6, 6, 6, 7, 7, 9};
        int k = 4;

        Arrays.stream(findKMostFrequentElements(integerArray, k)).forEach(System.out::println);
        Arrays.stream(findKMostFrequentElementsUsingPriorityQueue(integerArray, k)).forEach(System.out::println);
        Arrays.stream(findKMostFrequentElementsUsingStreams(integerArray, k)).forEach(System.out::println);
    }

    private static int[] findKMostFrequentElements(int[] integerArray, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : integerArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((n1, n2) -> n2.getValue() - n1.getValue());

        int[] result = new int[k];
        for (int i = 0; (i < k && i < entryList.size()); i++) {
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }

    private static int[] findKMostFrequentElementsUsingPriorityQueue(int[] integerArray, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : integerArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((num1, num2) -> num2.getValue() - num1.getValue());
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            maxHeap.offer(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result[i] = maxHeap.poll().getKey();
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
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
