package pl.edu.pjwstk;

import junit.framework.TestCase;

public class ChopTest extends TestCase {
    public void testChop() throws Exception {
        Chop c = new Chop();
        assertEquals(0, c.chop(1, new int[] {1,2,5}));
        assertEquals(1, c.chop(1, new int[] {0,1,2}));
        assertEquals(2, c.chop(3, new int[] {1,2,3}));
        assertEquals(0,  c.chop(1,new int[] {1, 3, 5, 7}));
        assertEquals(1,  c.chop(3,new int[] {1, 3, 5, 7}));
        assertEquals(2,  c.chop(5,new int[] {1, 3, 5, 7}));
        assertEquals(3,  c.chop(7,new int[] {1, 3, 5, 7}));
        assertEquals(-1, c.chop(0,new int[] {1, 3, 5, 7}));
        assertEquals(-1, c.chop(2,new int[] {1, 3, 5, 7}));
        assertEquals(-1, c.chop(4,new int[] {1, 3, 5, 7}));
        assertEquals(-1, c.chop(6,new int[] {1, 3, 5, 7}));
        assertEquals(-1, c.chop(8,new int[] {1, 3, 5, 7}));
        assertEquals(8,  c.chop(15,new int[] {1, 3, 5, 7, 8, 9, 10, 11, 15}));

    }

}