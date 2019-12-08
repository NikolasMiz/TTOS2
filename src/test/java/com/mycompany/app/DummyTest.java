package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {
    @Test
    public void testShouldReturn1() {
        assertEquals(1, new DummyClass().anInt(1));
    }

    @Test
    public void testShouldReturn2() {
        assertEquals(2, new DummyClass().anInt(2));
    }
}
