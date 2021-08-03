// import java.util.Arrays;

// Create another variation of the findLetter method, but this time, make it start in the middle of the dataset and search in both directions from the middle.
// You can use the findLetter(..) and findLetterBackwards(..) methods.
// You may call this method from within findLetterFromMiddle(..).

// HINT: When you call findLetter(..) and findLetterBackwards(..), you will have to split the data set in half so that one searches the front half and the other searches the back half of the original array.
// Furthermore, you’ll need to check the output from each call and return the correct result.
// For example, if the value is in the second half, then the first half will return -1.
// You should return the result of the second half in this case.
// You also need to handle when the length of the data set is even or odd.

public class WritingAlgorithmsSearchAlgorithmsExercise2 {

	// LinearSearch
	public static void main(String[] args) {
		// char letter = 'K'; // -1
		char letter = 'k'; // 10

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' };
		// char[] letters = null;

		// class instance
		WritingAlgorithmsSearchAlgorithmsExercise2 w = new WritingAlgorithmsSearchAlgorithmsExercise2();

		// call methods
		System.out.println("the index of letter '" + letter + "': " + w.findLetterIndexFromMiddle(letter, letters));
	}

	public int findLetterIndex(char target, char[] data) {
		if (data == null ) {
			return -1;
		}

		int result = -1;

		for (int i = 0; i < data.length; i++) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}

		return result;
	}

	public int findLetterIndexBackwards(char target, char[] data) {
		if (data == null ) {
			return -1;
		}

		int result = -1;

		for (int i = data.length - 1; i > -1; i--) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}

		return result;
	}

	public int findLetterIndexFromMiddle(char target, char[] data) {
		if (data == null ) {
			return -1;
		}

		System.out.println("findLetterIndexFromMiddle > data.length: " + (data.length));
		System.out.println("findLetterIndexFromMiddle > data.length/2: " + (data.length/2));

		// split data in half
		char[] firstHalf  = new char[data.length/2];
		System.out.println("findLetterIndexFromMiddle > firstHalf.length: " + firstHalf.length);

		char[] secondHalf = new char[data.length - data.length/2];
		System.out.println("findLetterIndexFromMiddle > secondHalf.length: " + secondHalf.length);

		// fill first array
		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = data[i];
		}

		// fill second array
		for (int i = 0; i < secondHalf.length; i++) {
			secondHalf[i] = data[i + firstHalf.length];
		}

		// perform searching
		int result1 = findLetterIndex(target, firstHalf);
		int result2 = findLetterIndexBackwards(target, secondHalf);

		//compare results
		if (result1 > -1) {
			return result1;
		} else if (result2 > -1) {
			// secondHalf needs to add length/2 to return the correct index
			return result2 + firstHalf.length;
		} else {
			return -1;
		}
	}
}
