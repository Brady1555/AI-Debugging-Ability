public class ComplexBug27 {
	
	private int real;
	private int imaginary;
	
	public ComplexBug27() {
		this.real = 0;
        this.imaginary = 0;  
	}
	
	public ComplexBug27(int x, int y) {
		real = x;
        imaginary = y;  
	}
	
	public ComplexBug27 add (ComplexBug27 x, ComplexBug27 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug27 subtract (ComplexBug27 x, ComplexBug27 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug27 c) {
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug27 c1 = new ComplexBug27(3, -5);
		ComplexBug27 c2 = new ComplexBug27(8, 7);
		ComplexBug27 sum = new ComplexBug27();
		sum.add(c1, c2);
		ComplexBug27 diff = new ComplexBug27();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug27.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug27.printResult(diff);
	}
}