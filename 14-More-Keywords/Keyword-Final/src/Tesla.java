public class Tesla { 

	final int someVar;

	// constructor
	public Tesla() {
		this.someVar = 50;
		System.out.println("Inside constructor > this.someVar: " + this.someVar);

		// variable 'someVar' marked final. cannot change 'someVar' value
		// this.someVar = 10;
		// System.out.println("Inside constructor > this.someVar: " + this.someVar);
	}

	public static void main(String[] args) {
		// new instance
		Tesla t = new Tesla();
		System.out.println("Inside main method > t.someVar: " + t.someVar);
	}
}
