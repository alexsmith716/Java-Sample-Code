public class DoWhileLoopExercise2Solution {

	public static void main(String[] args) {
		char letter = 'a';
		char end = 'z';

		do {
			System.out.println(letter);
			letter++;
		} while (letter <= end);
	}
}
