public class WritingAlgorithmsSearchAlgorithmsCodeActivity {

	// LinearSearch
	public static void main(String[] args) {
		// create dummy data for the method
		char letter = 'O';

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		// char[] letters = null;

		// class instance
		WritingAlgorithmsSearchAlgorithmsCodeActivity w = new WritingAlgorithmsSearchAlgorithmsCodeActivity();

		// call methods
		System.out.println(w.findLetter(letter, letters));
	}

	public int findLetter(char target, char[] data) {

		if (data == null ) {
			return -1;
		}

		int result = -1;

		// loop data
		for (int i = 0; i < data.length; i++) {

			char temp = data[i];

			// test current element against target
			if (temp == target) {
				return i;
			}
		}

		return result;
	}
}
