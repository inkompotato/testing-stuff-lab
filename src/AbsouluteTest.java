import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsouluteTest extends Absoulute {


    @Test
    void absoluteValueOf0() {
        assertEquals(0,absoluteValueOf(0));
    }

    @Test
    void absoluteValueOf1() {
        assertEquals(1,absoluteValueOf(1));
    }

    @Test
    void absoluteValueOfminus1() {
        assertEquals(1,absoluteValueOf(-1));
    }

    @Test
    void absoluteValueOf10() {
        assertEquals(10,absoluteValueOf(-10));
    }

    @Test
    void absoluteValueOfmaxInteger() {
        assertEquals(Integer.MAX_VALUE,absoluteValueOf(Integer.MIN_VALUE+1));
    }

}