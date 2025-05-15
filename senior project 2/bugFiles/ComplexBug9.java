public class ComplexBug9 {
	
	private int real;
	private int imaginary;
	
	ComplexBug9() {
		this.real = 0;
		this.imaginary = 0;  
	}
	
	ComplexBug9(int x, int y) {
		real = x;
		imaginary = y;  // fixed typo
	}
	
	public ComplexBug9 add(ComplexBug9 x, ComplexBug9 y) {
		this.real = x.real + y.real;
		this.imaginary = x.imaginary + y.imaginary; // fixed typo
		return this;
	}

	public ComplexBug9 subtract(ComplexBug9 x, ComplexBug9 y) {
		this.real = x.real - y.real;
		this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult(ComplexBug9 c) {
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug9 c1 = new ComplexBug9(3, -5);
		ComplexBug9 c2 = new ComplexBug9(8, 7);
		ComplexBug9 sum = new ComplexBug9();
		sum.add(c1, c2);
		ComplexBug9 diff = new ComplexBug9();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug9.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug9.printResult(diff);
	}
}