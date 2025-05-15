public class ComplexBug41 {
	
	private int real;
	private int imaginary;
	
	ComplexBug41(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug41(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug41 add (ComplexBug41 x, ComplexBug41 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug41 subtract (ComplexBug41 x, ComplexBug41 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug41 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug41 c1= new ComplexBug41(3, -5);
		ComplexBug41 c#= new ComplexBug41(8, 7);
		ComplexBug41 sum = new ComplexBug41();
		sum.add(c1, c#);
		ComplexBug41 diff = new ComplexBug41();
		diff.subtract(c1, c#);
		System.out.println("The sum is ");
		ComplexBug41.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug41.printResult(diff);
	}

}