package pl.edu.pjwstk;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingItOutTest extends TestCase {

    public void testSortingLetters() throws Exception {
        SortingItOut s1 = new SortingItOut();

        assertEquals("aabbccdd", s1.sortLetters("dcdacbab"));
        assertEquals("aaaabbbbbcdss", s1.sortLetters("bbbbbcaaaadss"));
        assertEquals("aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy", s1.sortLetters("When not studying nuclear physics, Bambi likes to play " +
                "beach volleyball."));


    }

    public void testSortingNumbers() throws Exception {
        SortingItOut s1 = new SortingItOut();
        ArrayList<Integer> rack = new ArrayList<Integer>();
        assertEquals(Arrays.asList(), s1.sortNumbers(rack));
        rack.add(20);
        assertEquals(Arrays.asList(20), s1.sortNumbers(rack));
        rack.add(10);
        assertEquals(Arrays.asList(10, 20), s1.sortNumbers(rack));
        rack.add(30);
        assertEquals(Arrays.asList(10, 20, 30), s1.sortNumbers(rack));


    }

}