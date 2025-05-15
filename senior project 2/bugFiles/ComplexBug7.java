public class ComplexBug7 {
	
	private int real;
	private int imaginary;
	
	public ComplexBug7() {
		this.real = 0;
		this.imaginary = 0;
	}
	
	public ComplexBug7(int x, int y) {
		this.real = x;
		this.imaginary = y;
	}
	
	public ComplexBug7 add(ComplexBug7 x, ComplexBug7 y) {
		this.real = x.real + y.real;
		this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug7 subtract(ComplexBug7 x, ComplexBug7 y) {
		this.real = x.real - y.real;
		this.imaginary = x.imaginary - y.imaginary;
		return this;
	}
	
	public static void printResult(ComplexBug7 c) {
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug7 c1 = new ComplexBug7(3, -5);
		ComplexBug7 c2 = new ComplexBug7(8, 7);
		ComplexBug7 sum = new ComplexBug7();
		sum.add(c1, c2);
		ComplexBug7 diff = new ComplexBug7();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug7.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug7.printResult(diff);
	}

}