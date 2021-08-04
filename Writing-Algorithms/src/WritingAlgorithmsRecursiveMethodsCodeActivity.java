// recursive algorithm for calculating the factorial of a number

public class WritingAlgorithmsRecursiveMethodsCodeActivity {

	public static void main(String[] args) {
		// create dummy data for the method
		int input = 5;

		// class instance
		WritingAlgorithmsRecursiveMethodsCodeActivity w = new WritingAlgorithmsRecursiveMethodsCodeActivity();

		// call methods
		System.out.println("w.factorial(input): " + w.factorial(input));
	}

	public int factorial(int num) {

		System.out.println("factorial > num: " + num);

		if (num <= 0) {
			System.out.println("factorial ? num <= 0: " + num);
			return 0;
		}

		if (num == 1) {
			System.out.println("factorial ? num == 1: " + num);
			return 1;
		}

		return num * factorial(num-1);
	}
}
