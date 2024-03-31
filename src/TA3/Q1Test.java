package TA3;

import org.junit.jupiter.api.Test;

import static TA3.Q1.arraySum;
import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    void testArraySum() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(arraySum(arr), 15); // Output: 15
    }

    @Test
    void test_negative() {
        int[] arr = {1, -1};
        assertEquals(arraySum(arr), 0); // Output: 15
    }
}