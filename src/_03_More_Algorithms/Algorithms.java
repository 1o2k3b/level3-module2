package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return "" + num1 + " x " + num2 + " = " + (num1 * num2);

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

	public static int countPearls(List<Boolean> oysters) {
		int num = 0;
		for (boolean i : oysters) {
			if (i) {
				num++;
			}
		}
		return num;

	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double highest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > highest) {
				highest = peeps.get(i);
			}
		}
		return highest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = "";

		for (String i : words) {
			if (i.length() > longest.length()) {
				longest = i;
			}
		}
		return longest;
	}

	public static Boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		for (String i : message) {
			if (i.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < results.size() - 1; i++) {

				double current = results.get(i);
				double next = results.get(i + 1);
				if (results.get(i) > results.get(i + 1)) {
					results.set(i, next);
					results.set(i + 1, current);
					sorted = false;
				}

			}
		}

		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
//		// TODO Auto-generated method stub
//		boolean sorted = false;
//		while (!sorted) {
//			sorted = true;
//		for(String strand:unsortedSequences) {
//			String current = strand;
//			if(strand.length()>(strand+1).length()) {
//				unsortedSequences.set(unsortedSequences.indexOf(strand), strand+1);
//				unsortedSequences.set(unsortedSequences.indexOf(strand+1), current);
//				sorted = false;
//			}
//		}
//		}
//		return unsortedSequences;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < unsortedSequences.size() - 1; i++) {

				String current = unsortedSequences.get(i);
				String next = unsortedSequences.get(i + 1);
				if (unsortedSequences.get(i).length() > unsortedSequences.get(i + 1).length()) {
					unsortedSequences.set(i, next);
					unsortedSequences.set(i + 1, current);
					sorted = false;
				}

			}
		}

		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < words.size() - 1; i++) {

				String current = words.get(i);
				String next = words.get(i + 1);
				if (current.charAt(0) > (next.charAt(0))) {
					words.set(i, next);
					words.set(i + 1, current);
					sorted = false;
				}

			}
		}

		return words;

	}

	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		for (int checker = 2; checker < i; checker++) {
			if (i % checker == 0) {
				isPrime = false;
				return false;

			}
		}
		return isPrime;

	}

	public static boolean isSquare(int i) {
		// TODO Auto-generated method stub
		double placeholder = Math.pow(i + 0.0, 0.5);
		if (placeholder % 1 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isCube(int i) {
		// TODO Auto-generated method stub

		if(	Math.cbrt(i)% 1 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
