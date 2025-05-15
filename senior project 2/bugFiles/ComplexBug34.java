public class ComplexBug34 {
	
	private int real;
	private int imaginary;
	
	ComplexBug34(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug34(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug34 add (ComplexBug34 x, ComplexBug34 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug34 subtract (ComplexBug34 x, ComplexBug34 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug34 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug34 c1= new ComplexBug34(3, -5);
		ComplexBug34 c2= new ComplexBug34(8, 7);
		ComplexBug34 summ = new ComplexBug34();
		summ.add(c1, c2);
		ComplexBug34 diff = new ComplexBug34();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug34.printResult(summ);
		System.out.println("The difference is ");
		ComplexBug34.printResult(diff);
	}

}