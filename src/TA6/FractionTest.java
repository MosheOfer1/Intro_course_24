package TA6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void plus() {
        Fraction a = new Fraction(1, 6);
        Fraction b = new Fraction(2, 13);
        a.plus(b);
        System.out.println(a);
        Fraction c = new Fraction(25,78);
        assertEquals(c, a);
    }
}