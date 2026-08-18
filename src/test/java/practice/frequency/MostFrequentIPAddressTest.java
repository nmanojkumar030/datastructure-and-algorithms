package practice.frequency;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MostFrequentIPAddressTest {

    @Test
    void shouldReturnSingleMostFrequentIPAddress() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        assertEquals(List.of("10.0.0.1"), mostFrequentIpAddress.mostFrequent());
    }

    @Test
    void shouldReturnAllTiedMostFrequentIPAddresses() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        List<String> ipAddressList = mostFrequentIpAddress.mostFrequent();
        assertEquals(2, ipAddressList.size());
        assertTrue(ipAddressList.containsAll(List.of("10.0.0.1", "10.0.0.2")));
    }

    @Test
    void shouldReturnSingleMostFrequentIPAddressUsingStreams() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        assertEquals(List.of("10.0.0.1"), mostFrequentIpAddress.mostFrequentUsingStreams());
    }

    @Test
    void shouldReturnAllTiedMostFrequentIPAddressesUsingStreams() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        List<String> ipAddressList = mostFrequentIpAddress.mostFrequentUsingStreams();
        assertEquals(2, ipAddressList.size());
        assertTrue(ipAddressList.containsAll(List.of("10.0.0.1", "10.0.0.2")));
    }

    @Test
    void shouldReturnSingleLogLineIpAddress() {
        String[] logLines = new String[]{"10.0.0.5 - GET 2020-08-24"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        assertEquals(List.of("10.0.0.5"), mostFrequentIpAddress.mostFrequent());
        assertEquals(List.of("10.0.0.5"), mostFrequentIpAddress.mostFrequentUsingStreams());
    }
}
