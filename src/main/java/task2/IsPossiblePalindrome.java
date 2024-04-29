package task2;

import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class IsPossiblePalindrome {

    public static boolean check(String input) {

        Map<Character, Long> charFreq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(Function.identity(), counting()));

        long oddCount = charFreq.values().stream()
                .filter(c -> c % 2 != 0)
                .count();

        return oddCount <= 1;
    }
}