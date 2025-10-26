package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
   Collections.sort(list);
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        int checker = 0;
    	Arrays.sort(arr);
      checker = Arrays.binarySearch(arr, key);
System.out.println(checker);
        if(checker > 0) {
        return true;
        } else {
        	return false;
        }
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	int checker = 0;
        Collections.sort(list);
       checker = Collections.binarySearch(list, key);
       if(checker > 0) {
    	   return true;
       } else {
        return false;
    }
    }
}
