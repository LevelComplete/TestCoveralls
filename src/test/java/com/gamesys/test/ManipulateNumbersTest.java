package com.gamesys.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManipulateNumbersTest {

    private ManipulateNumbers testObj = new ManipulateNumbers();

    @Test
    public void testAddition() {
        assertEquals(2, testObj.addTwoNumbers(1, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, testObj.subtractTwoNumbers(1, 1));
    }

    @Test
    public void testDivision() {assertEquals(1, testObj.divideNumbers(1, 1)); }
}
