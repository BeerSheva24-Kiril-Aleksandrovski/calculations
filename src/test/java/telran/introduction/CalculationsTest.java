package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
@Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(-9, sum(-32, 23));
    }
@Test    
    void multiplyTest () {
        assertEquals(44, multiply(2, 22));
        assertEquals(-44, multiply(-2, 22));
        assertEquals(0, multiply(0, -1323));
    }
@Test 
    void divideTest () {
        assertEquals(1, divide(2, 2));
        assertEquals(0, divide(2, 3));
        assertEquals(-6, divide(12, -2));
    }
@Test 
    void subtractTest () {
        assertEquals(0, subtract(2, 2));
        assertEquals(0, subtract(2, 2));
        assertEquals(0, subtract(2, 2));
    }
@Test 
    void sumOfDigitsTest () {
        assertEquals(10, sumOfDigits(1234));
        assertEquals(46, sumOfDigits(35719876));
        assertEquals(0, sumOfDigits(0));
        assertEquals(10, sumOfDigits(-1234));
    }
@Test 
    void maxDigitTest () {
        assertEquals(4, maxDigit (1234));
        assertEquals(0, maxDigit (0));
        assertEquals(8, maxDigit (-814000123));
        assertEquals(4, maxDigit (104302301));
        assertEquals(8, maxDigit (-2147483647));


    }
     
@Test 
    void isDividedOnTest () {
        assertEquals(true, isDividedOn (22, 11));
        assertEquals(false, isDividedOn (22, 10));
        assertEquals(false, isDividedOn (22, 0));
        assertEquals(true, isDividedOn (22, -11));
        assertEquals(true, isDividedOn (-22, -11));



    }
}
