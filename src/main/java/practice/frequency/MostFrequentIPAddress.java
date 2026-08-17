package practice.frequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentIPAddress {

    private final String[] logLines;

    public MostFrequentIPAddress(String[] logLines) {
        this.logLines = logLines;
    }

    public List<String> mostFrequent() {
        Map<String, Integer> ipCountMap = new HashMap<>();
        for (String logLine : logLines) {
            String[] parsedStrings = logLine.split(" ");
            ipCountMap.put(parsedStrings[0], ipCountMap.getOrDefault(parsedStrings[0], 1) + 1);
        }

        int mostFrequency = -1;
        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            mostFrequency = Math.max(entry.getValue(), mostFrequency);
        }

        List<String> ipAddressList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            if (Objects.equals(entry.getValue(), mostFrequency)) {
                ipAddressList.add(entry.getKey());
            }
        }
        return ipAddressList;
    }

    public List<String> mostFrequentUsingStreams() {
        Map<String, Long> ipCountMap = Arrays.stream(logLines)
                .map(logLine -> logLine.split(" ")[0])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long mostFrequency = ipCountMap.values().stream()
                .max(Long::compareTo)
                .orElse(0L);

        return ipCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == mostFrequency)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
