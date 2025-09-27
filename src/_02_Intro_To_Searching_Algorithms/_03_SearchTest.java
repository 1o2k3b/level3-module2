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
    	int[] array = {-8, 0, 1, 8, 387, 6739};
    	int index1 = _02_BinarySearch.binarySearch(array, 0, array.length-1, -8);
    	int index2 = _02_BinarySearch.binarySearch(array, 0, array.length-1,0);
    	int index3 = _02_BinarySearch.binarySearch(array, 0, array.length-1, 1);
    	int index4 = _02_BinarySearch.binarySearch(array, 0, array.length-1, 8);
    	int index5 = _02_BinarySearch.binarySearch(array, 0, array.length-1,387);
    	int index6 = _02_BinarySearch.binarySearch(array, 0, array.length-1,6739);
    	System.out.println(index1 + ", "+ index2 + ", " + index3 + ", " + index4 + ", " + index5 + ", " + index6 + ", ");
    	assertEquals(0, index1);
    	assertEquals(1, index2);
    	assertEquals(2, index3 );
    	assertEquals(3, index4);
    	assertEquals(4, index5);
    	assertEquals(5, index6 );
    }
}
