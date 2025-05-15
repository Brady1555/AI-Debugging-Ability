public class ComplexBug1 {
	
	private int real;        // Was colon ':' instead of semicolon ';'
	private int imaginary;   // Same here
	
	ComplexBug1(){
		this.real = 0;
        this.imaginary = 0;  // Was colon ':' instead of semicolon ';'
	}
	
	ComplexBug1(int x, int y){
		real = x;
        imaginary = y;  
	}
	
	public ComplexBug1 add (ComplexBug1 x, ComplexBug1 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug1 subtract (ComplexBug1 x, ComplexBug1 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug1 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
	}

	public static void main(String[] args) {
		ComplexBug1 c1 = new ComplexBug1(3, -5);
		ComplexBug1 c2 = new ComplexBug1(8, 7);
		ComplexBug1 sum = new ComplexBug1();
		sum.add(c1, c2);
		ComplexBug1 diff = new ComplexBug1();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug1.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug1.printResult(diff);
	}
}