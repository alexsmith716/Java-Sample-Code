public class WritingAlgorithmsSearchAlgorithmsExercise1 {

	// LinearSearch
	public static void main(String[] args) {
		// create dummy data for the method
		char letter = 'O';

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		// char[] letters = null;

		// class instance
		WritingAlgorithmsSearchAlgorithmsExercise1 w = new WritingAlgorithmsSearchAlgorithmsExercise1();

		// call methods
		System.out.println(w.findLetterBackwards(letter, letters));
	}

	public int findLetterBackwards(char target, char[] data) {

		if (data == null ) {
			return -1;
		}

		int result = -1;

		// loop data
		for (int i = data.length - 1; i > -1; i--) {

			char temp = data[i];

			// test current element against target
			if (temp == target) {
				return i;
			}
		}

		return result;
	}
}
