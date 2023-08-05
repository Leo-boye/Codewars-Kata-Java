package test.java.kyu8;

import main.java.kyu8.TwiceAsOld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TwiceAsOldTest {
    @Test
    public void test1() {
        assertEquals(30, TwiceAsOld.TwiceAsOld(30,0));

    }
    @Test
    public void test2() {
        assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));
    }
    @Test
    public void test3() {
        assertEquals(15, TwiceAsOld.TwiceAsOld(45,30));
    }
    @Test
    public void test4() {
        assertEquals(10, TwiceAsOld.TwiceAsOld(20,15));
    }
    @Test
    public void test5() {
        assertEquals(15, TwiceAsOld.TwiceAsOld(15,15));
    }
}