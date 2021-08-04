// Implement binary search using recursion.
// You should search upon an int array and return the index of a given int.
// If the number is not in the list, then return -1;

// NOTE: You may create additional methods to help solve this one.

public class WritingAlgorithmsRecursiveMethodsExercise2 {

	public static void main(String[] args) {
		// create data for the method
		int target = 7;
		int[] data = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 };

		// class instance
		WritingAlgorithmsRecursiveMethodsExercise2 w = new WritingAlgorithmsRecursiveMethodsExercise2();

		// call methods
		System.out.println("w.binarySearch(input): " + w.binarySearch(data, target));
	}

	public int binarySearch(int[] data, int target) {
		System.out.println("binarySearch > target: " + target);
		// return -1 if the given array is empty
		if (data == null || data.length == 0) {
			return -1;
		}

		// define the range of indexes
		int minRange = 0;
		int maxRange = data.length;

		// find the midpoint value
		int midpoint = data[maxRange/2];

		System.out.println("binarySearch > maxRange: " + maxRange);
		System.out.println("binarySearch > midpoint: " + midpoint);

		if (midpoint == target) {
			// return the position
			return maxRange/2;

		} else if (data.length == 1 ) {
			// this is to stop additional recursive calls
			return -1;

		} else if (midpoint < target) {
			minRange = (maxRange/2);

			// create new data to search upon
			int[] temp = copyArray(data, minRange, maxRange);

			// need to add the range if it is in the upper half
			// to keep track of the index otherwise the index is based //on the smaller range
			int indexAdder = (maxRange/2);

			// find the index in the smaller array
			int search = binarySearch(temp, target);

			// check if the search found the value
			if (search == -1) {
				// return -1, if the search didn't find it
				return -1;
			} else {
				return indexAdder + search;
				// return the value plus the adder if found
			}
		} else if (midpoint > target) {
			maxRange = (maxRange/2);
			// create new data to search upon
			int[] temp = copyArray(data, minRange, maxRange);

			// searching the lower half, don't need to keep track of the index
			return binarySearch(temp, target);
		}
		return -1;
	}

	// method used to copy the values of one array into the next
	public int[] copyArray(int[] original, int min, int max) {
		System.out.println("copyArray > min-max: " + min + "-" + max);
		int[] target = new int[max-min];

		for (int i = 0; i < target.length; i++) {
			target[i] = original[min+i];
		}
		
		return target;
	}
}
