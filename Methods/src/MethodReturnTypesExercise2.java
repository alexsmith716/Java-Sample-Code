public class MethodReturnTypesExercise2 {

	public static void main(String[] args) {

		// class instance
		MethodReturnTypesExercise2 m = new MethodReturnTypesExercise2();

		char[] arr = m.getAlphabetArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("letter: " + arr[i]);
		}
	}

	public char[] getAlphabetArray() {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		return letters;
	}
}
