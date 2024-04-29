package task6;

import java.util.HashMap;
import java.util.Map;

public class FrequencyImpl implements Frequency {

    @Override
    public Map<Character, Double> analyze(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        // Calculate the relative frequency of each character
        Map<Character, Double> result = new HashMap<>();

        input.toLowerCase().chars().mapToObj(c -> (char) c).forEach(
                c2 -> result.put(c2, 0d)
        );

        result.keySet().forEach(k -> {
            result.put(k, 1d/result.keySet().size());
        });

        return result;
    }
}
