// Write a recursive method to print itself and all previous letters of the alphabet given a single letter on the same line.
// You can assume the letter will be lowercase.

// HINT: Use the char data type as it is easy to convert one letter to the next using mathematical operators.

public class WritingAlgorithmsRecursiveMethodsExercise1 {

	public static void main(String[] args) {
		// create data for the method
		char input = 'h';

		// class instance
		WritingAlgorithmsRecursiveMethodsExercise1 w = new WritingAlgorithmsRecursiveMethodsExercise1();

		// call methods
		w.printChar(input);
	}

	public void printChar(char input) {

		if (input < 'a' || input >  'z') {
			return;
		};

		System.out.println(input);

		input -= 1;
		printChar(input);
	}
}
