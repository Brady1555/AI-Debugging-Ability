public class ComplexBug44 {
	
	private int real;
	private int imaginary;
	
	ComplexBug44)({
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug44(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug44 add (ComplexBug44 x, ComplexBug44 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug44 subtract (ComplexBug44 x, ComplexBug44 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug44 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug44 c1= new ComplexBug44(3, -5);
		ComplexBug44 c2= new ComplexBug44(8, 7);
		ComplexBug44 sum = new ComplexBug44)(;
		sum.add(c1, c2);
		ComplexBug44 diff = new ComplexBug44)(;
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug44.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug44.printResult(diff);
	}

}