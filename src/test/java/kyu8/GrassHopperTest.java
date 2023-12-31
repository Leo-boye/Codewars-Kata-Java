package test.java.kyu8;

import main.java.kyu8.GrassHopper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrassHopper.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrassHopper.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrassHopper.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrassHopper.sayHello("Dr. McCoy"));
    }
}
