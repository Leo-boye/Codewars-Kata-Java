package test.java.kyu5;

import main.java.kyu5.MaxSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaxSequence.sequence(new int[]{}));
    }
}
