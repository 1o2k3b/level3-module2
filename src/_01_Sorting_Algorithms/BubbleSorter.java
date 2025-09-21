package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	/*
	 * Use the bubble sorting algorithm to sort the array. You can use
	 * display.updateDisplay() to show the current progress on the graph.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int swaps = 0;

		boolean sorted = false;
		while (sorted == false) {
			swaps = 0;

			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i + 1]) {
					int b = array[i];
					array[i] = array[i + 1];
					array[i + 1] = b;
					sorted = false;
					swaps++;

					System.out.println(swaps);
					display.updateDisplay();
				}

			}

			if (swaps == 0) {
				sorted = true;
			}

		}

	}
}
