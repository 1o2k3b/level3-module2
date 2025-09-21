package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String[] words = {"hi", "hello", "konnichiwa"};
    	int index1 = _01_LinearSearch.linearSearch(words, "hello");
    	int index2 = _01_LinearSearch.linearSearch(words, "hi");
    	int index3 = _01_LinearSearch.linearSearch(words, "konnichiwa");
    	
        // 1. Use the assertEquals() method to test your linear search method
    	System.out.println(index1);
    	assertEquals(index1, 1);
    	assertEquals(index2, 0);
    	assertEquals(index3, 2);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(false, true);
    }
}
