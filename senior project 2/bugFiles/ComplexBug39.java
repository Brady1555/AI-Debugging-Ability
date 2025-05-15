public class ComplexBug39 {
	
	private int real;
	private int fake;
	
	ComplexBug39(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug39(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug39 add (ComplexBug39 x, ComplexBug39 y) {
		this.real = x.real + y.real;
        this.fake = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug39 subtract (ComplexBug39 x, ComplexBug39 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug39 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.fake+")");
		
	}

	public static void main(String[]args) {
		ComplexBug39 c1= new ComplexBug39(3, -5);
		ComplexBug39 c2= new ComplexBug39(8, 7);
		ComplexBug39 sum = new ComplexBug39();
		sum.add(c1, c2);
		ComplexBug39 diff = new ComplexBug39();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug39.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug39.printResult(diff);
	}

}