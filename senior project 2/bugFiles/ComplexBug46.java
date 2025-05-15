public class ComplexBug46 {
	
	private int real;
	private int imaginary;
	
	ComplexBug46(){
		this.real = 0;
        this.imaginary = 0;  
	
	
	
	ComplexBug46(int x, int y){
		real = x;
        imaginary = y;  
	
	
	
	public ComplexBug46 add (ComplexBug46 x, ComplexBug46 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug46 subtract (ComplexBug46 x, ComplexBug46 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug46 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug46 c1= new ComplexBug46(3, -5);
		ComplexBug46 c2= new ComplexBug46(8, 7);
		ComplexBug46 sum = new ComplexBug46();
		sum.add(c1, c2);
		ComplexBug46 diff = new ComplexBug46();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug46.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug46.printResult(diff);
	}

