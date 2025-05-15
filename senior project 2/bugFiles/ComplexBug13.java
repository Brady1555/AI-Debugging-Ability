public class ComplexBug13 {

	private int real;
	private int imaginary;

	// Default constructor
	ComplexBug13() {
		this.real = 0;
		this.imaginary = 0;
	}

	// Parameterized constructor
	ComplexBug13(int x, int y) {
		real = x;
		imaginary = y;
	}

	// Adds two complex numbers and returns a new result
	public static ComplexBug13 add(ComplexBug13 x, ComplexBug13 y) {
		return new ComplexBug13(x.real + y.real, x.imaginary + y.imaginary);
	}

	// Subtracts two complex numbers and returns a new result
	public static ComplexBug13 subtract(ComplexBug13 x, ComplexBug13 y) {
		return new ComplexBug13(x.real - y.real, x.imaginary - y.imaginary);
	}

	// Prints the complex number
	public static void printResult(ComplexBug13 c) {
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug13 c1 = new ComplexBug13(3, -5);
		ComplexBug13 c2 = new ComplexBug13(8, 7);
		ComplexBug13 sum = ComplexBug13.add(c1, c2);
		ComplexBug13 diff = ComplexBug13.subtract(c1, c2);

		System.out.println("The sum is ");
		ComplexBug13.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug13.printResult(diff);
	}
}