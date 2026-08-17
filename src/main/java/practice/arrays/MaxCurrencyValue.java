package practice.arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Given a List of currency amounts as Doubles, find the maximum value using Java streams.
 */
public class MaxCurrencyValue {

    public double findMax(List<Double> currencyList) {
        Optional<Double> max = currencyList.stream().max(Double::compareTo);
        return max.orElseThrow(() -> new IllegalArgumentException("currencyList must not be empty"));
    }
}
