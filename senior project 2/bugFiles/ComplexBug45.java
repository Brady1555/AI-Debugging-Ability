public class ComplexBug45 {
	
	private int real;
	private int imaginary;
	
	ComplexBug45(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug45(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug45 add (ComplexBug45 x, ComplexBug45 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug45 subtract (ComplexBug45 x, ComplexBug45 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug45 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void man(String arg) {
		ComplexBug45 c1= new ComplexBug45(3, -5);
		ComplexBug45 c2= new ComplexBug45(8, 7);
		ComplexBug45 sum = new ComplexBug45();
		sum.add(c1, c2);
		ComplexBug45 diff = new ComplexBug45();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug45.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug45.printResult(diff);
	}

}