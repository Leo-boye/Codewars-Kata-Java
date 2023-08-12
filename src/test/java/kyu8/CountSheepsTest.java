package test.java.kyu8;

import main.java.kyu8.CountSheeps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSheepsTest {

    @Test
    public void test() {
        Boolean[] array = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        assertEquals("There are 17 sheeps in total", 17, new CountSheeps().countSheeps(array));
    }

    @Test
    public void test_empty() {
        Boolean[] array = {};
        assertEquals("There are 0 sheeps in total", 0, new CountSheeps().countSheeps(array));
    }

    @Test
    public void test_null_case() {
        Boolean[] array = {true, false, null, true};
        assertEquals("There are 2 sheeps in total", 2, new CountSheeps().countSheeps(array));
    }
}
