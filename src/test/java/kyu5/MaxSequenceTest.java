package test.java.kyu5;

import main.java.kyu5.MaxSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaxSequence.sequence(new int[]{}));
    }

    @Test
    public void testSimpleArray() throws Exception {
        assertEquals("Empty arrays should have a max of 5", 5, MaxSequence.sequence(new int[]{5}));
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaxSequence.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
