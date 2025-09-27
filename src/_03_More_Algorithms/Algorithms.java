package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
		
	}

	public static int findBrokenEgg(List<String> eggs) {
		int crackedEgg;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).contains("cracked")) {
				return i;
			}
		}
		return 0;

	}
	   public static int countPearls(List<Boolean> oysters){
int num = 0;
		for (boolean i:oysters) {
			   if(i) {
				   num++;
			   }
			}
		return num;
		   
	   }

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double highest = 0;
		for(int i  =0; i<peeps.size(); i++) {
			if(peeps.get(i)>highest) {
				highest = peeps.get(i);
			}
		}
		return highest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = "";
		
		for(String i:words) {
			if(i.length()>longest.length()) {
				longest = i;
			}
		}
		return longest;
	}

	public static Boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		for(String i:message) {
			if(i.contains("... --- ...")) {
			return true;
			}
		}
		return false;
	}
}
