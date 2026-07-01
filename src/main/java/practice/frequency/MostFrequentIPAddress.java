package practice.frequency;

import java.util.*;

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
}
