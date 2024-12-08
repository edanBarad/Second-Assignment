package Ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * This JUnit class represents a very partial test class for Ex1.Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v,11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10,s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for(int i=0;i<good.length;i=i+1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for(int i=0;i<not_good.length;i=i+1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }
    @Test
    void int2NumberTest() {
        String ansOf_609_2 = "1001100001b2", ansOf_56_4 = "320b4";
        assertEquals(Ex1.int2Number(609, 2), ansOf_609_2);
        assertEquals(Ex1.int2Number(56, 4), ansOf_56_4);
    }
    @Test
    void maxIndexTest() {
        String[] arr1 = {"1001b2", "11b3", "13", "36"}, arr2 = {"1DbG", "AAbB", "10010101b2", "110110011000b2"};
        assertEquals(Ex1.maxIndex(arr1), 3);
        assertEquals(Ex1.maxIndex(arr2), 3);
    }

    // Add additional test functions - test as much as you can.
    @Test
    void getBaseTest(){
        assertEquals(Ex1.getBase("123b4"), 4);
        assertEquals(Ex1.getBase("15DbF"), 15);
    }

    @Test
    void equalsTest(){
        assertTrue(Ex1.equals("101b2", "5"));
        assertFalse(Ex1.equals("101b2", "6"));
    }
}