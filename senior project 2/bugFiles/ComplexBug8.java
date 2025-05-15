public class ComplexBug8 {
	
	private int real;
	private int imaginary;
	
	ComplexBug8() {
		this.real = 0;
		this.imaginary = 0;  
	}
	
	ComplexBug8(int x, int y) {
		real = x;
		imaginary = y;  
	}
	
	public ComplexBug8 add(ComplexBug8 x, ComplexBug8 y) {
		this.real = x.real + y.real;
		this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug8 subtract(ComplexBug8 x, ComplexBug8 y) {
		this.real = x.real - y.real;
		this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult(ComplexBug8 c) {
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug8 c1 = new ComplexBug8(3, -5);
		ComplexBug8 c2 = new ComplexBug8(8, 7);
		ComplexBug8 sum = new ComplexBug8();
		sum.add(c1, c2);
		ComplexBug8 diff = new ComplexBug8();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug8.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug8.printResult(diff);
	}
}
