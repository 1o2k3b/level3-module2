package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random r = new Random();
int r1;
int r2;
		int swaps = 0;

		boolean sorted = false;
		while (sorted == false) {
			swaps = 0;
r1 = r.nextInt(array.length);
r2 = r.nextInt(array.length);
array[r1]=array[r2];
array[r2]=array[r1];
display.updateDisplay();
		}
	}
}
