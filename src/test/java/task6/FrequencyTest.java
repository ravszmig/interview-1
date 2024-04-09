package task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FrequencyTest {

    private Frequency frequency = new FrequencyImpl();

    @BeforeEach
    public void setUp() {
        frequency = getFrequency();
    }

    @Test
    public void should_return_1_for_single_character() {
        Map<Character, Double> result = frequency.analyze("a");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    public void should_return_half_when_two_different_characters() {
        Map<Character, Double> result = frequency.analyze("ab");

        assertEquals(0.5, result.get('a'));
        assertEquals(0.5, result.get('b'));
    }

    @Test
    public void should_return_1_for_the_same_character() {
        Map<Character, Double> result = frequency.analyze("aaa");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    public void should_return_even_half_when_two_different_characters() {
        Map<Character, Double> result = frequency.analyze("aab");

        assertEquals(0.5, result.get('a'));
        assertEquals(0.5, result.get('b'));
    }

    @Test
    public void should_return_even_half_when_different_characters() {
        Map<Character, Double> result = frequency.analyze("abcd");

        assertEquals(0.25, result.get('a'));
        assertEquals(0.25, result.get('b'));
        assertEquals(0.25, result.get('c'));
        assertEquals(0.25, result.get('d'));
    }

    @Test
    public void should_return_1_for_the_same_character_with_Upper_And_Lower_case() {
        Map<Character, Double> result = frequency.analyze("AaA");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    public void should_return_even_half_when_different_characters_occurs_few_times() {
        Map<Character, Double> result = frequency.analyze("aaaAbcdd");

        assertEquals(0.25, result.get('a'));
        assertEquals(0.25, result.get('b'));
        assertEquals(0.25, result.get('c'));
        assertEquals(0.25, result.get('d'));
    }

    @Test
    public void should_throw_exception_when_null_input() {
        assertThrows(IllegalArgumentException.class, () -> frequency.analyze(null));
    }

    private Frequency getFrequency() {
        return new FrequencyImpl();
    }
}