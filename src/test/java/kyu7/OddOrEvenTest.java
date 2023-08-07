package test.java.kyu7;

import main.java.kyu7.OddOrEven;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOrEvenTest {
    @Test
    public void oddTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
    @Test
    public void evenTest() {
        assertEquals("even", OddOrEven.oddOrEven(new int[] {2, 6, 20, 6}));
    }
}
