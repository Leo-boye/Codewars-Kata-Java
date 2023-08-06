package test.java.kyu8;

import main.java.kyu8.MixedSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MixedSumTest {

    MixedSum mixedSum = new MixedSum();

    @Test
    public void test_empty() {
        assertEquals(0, mixedSum.sum(List.of()));
    }

    @Test
    public void test_string_only() {
        assertEquals(10, mixedSum.sum(Arrays.asList("5", "5")));
    }

    @Test
    public void test_1() {
        assertEquals(10, mixedSum.sum(Arrays.asList(5, "5")));
    }

    @Test
    public void test_2() {
        assertEquals(22, mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
    }

    @Test
    public void test_3() {
        assertEquals(42, mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    @Test
    public void test_4() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test_5() {
        assertEquals(45, mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    }

    @Test
    public void test_6() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test_7() {
        assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }
}
