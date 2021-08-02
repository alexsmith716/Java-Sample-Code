public class MethodReturnTypesExampleCode {

	public static void main(String[] args) {

		// class instance
		// MethodReturnTypesExampleCode m = new MethodReturnTypesExampleCode();
		// String val = m.stringReturner();

		String val = stringReturner();
		System.out.println(val);
	}

	// public String stringReturner() {
	public static String stringReturner() {
		return "Hello";
	}
}
