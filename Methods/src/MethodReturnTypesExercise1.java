public class MethodReturnTypesExercise1 {

	public static void main(String[] args) {

		// class instance
		MethodReturnTypesExercise1 m = new MethodReturnTypesExercise1();

		double p = m.getPi();
		System.out.println("Math.PI: " + p);
	}

	public double getPi() {
		return Math.PI;
	}
}
