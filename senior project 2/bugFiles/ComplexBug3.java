public class ComplexBug3 {
	
	private int real;
	private int imaginary;
	
	ComplexBug3(){
		this.real = 0;
        this.imaginary = 0;  
	}
	
	ComplexBug3(int x, int y){
		real = x;
        imaginary = y;  
	}
	
	public ComplexBug3 add (ComplexBug3 x, ComplexBug3 y) {
		this.real = x.real + y.real;          // fixed typo here (y,real -> y.real)
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug3 subtract (ComplexBug3 x, ComplexBug3 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug3 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("(" + c.real + "," + c.imaginary + ")");  // fixed System.out,println to System.out.println
	}

	public static void main(String[] args) {
		ComplexBug3 c1 = new ComplexBug3(3, -5);
		ComplexBug3 c2 = new ComplexBug3(8, 7);
		ComplexBug3 sum = new ComplexBug3();
		sum.add(c1, c2);
		ComplexBug3 diff = new ComplexBug3();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");   // fixed System,out.println to System.out.println
		ComplexBug3.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug3.printResult(diff);
	}

}