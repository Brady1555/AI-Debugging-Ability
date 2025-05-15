public class ComplexBug35 {
	
	private int real;
	private int imaginary;
	
	ComplexBug35(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug35(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug35 add (ComplexBug35 x, ComplexBug35 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug35 subtract (ComplexBug35 x, ComplexBug35 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug35 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug35 c1= new ComplexBug35(3, -5);
		ComplexBug35 c2= new ComplexBug35(8, 7);
		ComplexBug35 sum = new ComplexBug35();
		sum.add(c1, c2);
		ComplexBug35 diff = new ComplexBug35();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug35.printResult(sum);
		System.out.println("The diffrence is ");
		ComplexBug35.printResult(diff);
	}

}