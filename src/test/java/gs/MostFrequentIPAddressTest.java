package gs;

import org.junit.jupiter.api.Test;

import java.util.List;

class MostFrequentIPAddressTest {

    @Test
    void shouldReturnMostFrequentIPAddress() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        List<String> ipAddressList = mostFrequentIpAddress.mostFrequent();
        for (String ip : ipAddressList) {
            System.out.println(ip);
        }
    }

    @Test
    void shouldReturnMostFrequentIPAddressList() {
        String[] logLines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.2 - GET 2020-08-20"};
        MostFrequentIPAddress mostFrequentIpAddress = new MostFrequentIPAddress(logLines);
        List<String> ipAddressList = mostFrequentIpAddress.mostFrequent();
        for (String ip : ipAddressList) {
            System.out.println(ip);
        }
    }
}