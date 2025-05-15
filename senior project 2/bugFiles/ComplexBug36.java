public class ComplexBug36 {
	
	private int real;
	private int imaginary;
	
	ComplexBug36(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug36(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug36 ad (ComplexBug36 x, ComplexBug36 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug36 subtract (ComplexBug36 x, ComplexBug36 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug36 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug36 c1= new ComplexBug36(3, -5);
		ComplexBug36 c2= new ComplexBug36(8, 7);
		ComplexBug36 sum = new ComplexBug36();
		sum.ad(c1, c2);
		ComplexBug36 diff = new ComplexBug36();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug36.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug36.printResult(diff);
	}

}