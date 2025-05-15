public class ComplexBug40 {
	
	private int real;
	private int imaginary;
	
	ComplexBug40(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug40(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug40 add (ComplexBug40 x, ComplexBug40 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug40 subtract (ComplexBug40 x, ComplexBug40 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug40 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug40 C1= new ComplexBug40(3, -5);
		ComplexBug40 c2= new ComplexBug40(8, 7);
		ComplexBug40 sum = new ComplexBug40();
		sum.add(C1, c2);
		ComplexBug40 diff = new ComplexBug40();
		diff.subtract(C1, c2);
		System.out.println("The sum is ");
		ComplexBug40.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug40.printResult(diff);
	}

}