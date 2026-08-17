package pattern.priorityqueues;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentNumbers {
    public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
        List<Integer> topNumbers = new ArrayList<>(k);
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int number : nums) {
            numberFrequencyMap.put(number, numberFrequencyMap.getOrDefault(number, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            topNumbers.add(minHeap.poll().getKey());
        }
        return topNumbers;
    }

    public static List<Integer> findTopKFrequentNumbers2(int[] nums, int k) {
        Map<Integer, Long> numberCountMap = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        PriorityQueue<Map.Entry<Integer, Long>> maxQueue = new PriorityQueue<>((o1, o2) -> Long.compare(o2.getValue(), o1.getValue()));
        for (Map.Entry<Integer, Long> entry : numberCountMap.entrySet()){
            maxQueue.offer(entry);
        }

        List<Integer> topNumbers = new ArrayList<>(k);
        for (int i = 0; i < k && !maxQueue.isEmpty(); i++) {
            topNumbers.add(maxQueue.poll().getKey());
        }

        return topNumbers;
    }
}
