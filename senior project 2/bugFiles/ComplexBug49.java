public class ComplexBug49 {
	
	private int real;
	private int imaginary;
	
	ComplexBug49(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug49(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug49 add (ComplexBug49 x, ComplexBug49 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug49 subtract (ComplexBug49 x, ComplexBug49 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug49 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+"."+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug49 c1= new ComplexBug49(3, -5);
		ComplexBug49 c2= new ComplexBug49(8, 7);
		ComplexBug49 sum = new ComplexBug49();
		sum.add(c1. c2);
		ComplexBug49 diff = new ComplexBug49();
		diff.subtract(c1. c2);
		System.out.println("The sum is ");
		ComplexBug49.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug49.printResult(diff);
	}

}