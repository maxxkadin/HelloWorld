package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void testFactorialOfPositiveNumbers() {
        assertEquals(120, NumberUtils.calculateFactorial(5));
        assertEquals(2, NumberUtils.calculateFactorial(2));
    }

    @Test
    void testFactorialOf0() {
        assertEquals(1, NumberUtils.calculateFactorial(0));
    }

    @Test
    void testFactorialOfNegativeNumbers() {
        assertEquals(-1, NumberUtils.calculateFactorial(-10));
    }
}