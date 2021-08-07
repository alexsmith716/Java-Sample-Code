public class SomeClass {

	long serialNumber;

	public SomeClass() {
		this(10l);
		System.out.println("Inside default no-arg constructor.");
	}

	public SomeClass(long serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("Inside constructor with parameter > this.serialNumber: " + this.serialNumber);

		this.serialNumber = 5345;
		System.out.println("Inside constructor with parameter > this.serialNumber: " + this.serialNumber);
	}

	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
	}
}
