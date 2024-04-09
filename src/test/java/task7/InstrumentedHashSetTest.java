package task7;


import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InstrumentedHashSetTest {

    @Test
    public void addAllAndCount() {
        //given
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();

        //when
        set.addAll(asList("A", "B", "C"));

        //then
        assertThat(set.getAddCount(), is(3));
    }

    @Test
    public void addAndCount() {
        //given
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();
        int numberOfAttempts = 10;

        //when
        for (int i = 0; i < numberOfAttempts; i++) {
            set.add("X");
        }

        //then
        assertThat(set.getAddCount(), is(numberOfAttempts));
    }
}