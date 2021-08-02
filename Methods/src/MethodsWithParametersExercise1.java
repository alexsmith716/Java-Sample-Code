public class MethodsWithParametersExercise1 {

	public static void main(String[] args) {

		// class instance
		MethodsWithParametersExercise1 m = new MethodsWithParametersExercise1();

		double[] arr = m.square(2, 4, 6, 8);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("square: " + arr[i]);
		}
	}

	public double[] square(int a, int b, int c, int d) {
		double[] result = {a*a, b*b, c*c, d*d};
		return result;
	}
}
