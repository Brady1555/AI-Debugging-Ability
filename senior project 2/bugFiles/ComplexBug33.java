public class ComplexBug33 {
	
	private int real;
	private int imaginary;
	
	ComplexBug33(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug33(int x, integer y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug33 add (ComplexBug33 x, ComplexBug33 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug33 subtract (ComplexBug33 x, ComplexBug33 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug33 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug33 c1= new ComplexBug33(3, -5);
		ComplexBug33 c2= new ComplexBug33(8, 7);
		ComplexBug33 sum = new ComplexBug33();
		sum.add(c1, c2);
		ComplexBug33 diff = new ComplexBug33();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug33.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug33.printResult(diff);
	}

}