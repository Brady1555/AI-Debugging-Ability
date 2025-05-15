public class ComplexBug20 {
	
	private int real;
	private int imaginary;
	
	ComplexBug20(){
		this.real = 0;
        this.imaginary = 0;  
	}
	
	ComplexBug20(int x, int y){
		real = x;
        imaginary = y;  
	}
	
	public ComplexBug20 add(ComplexBug20 x, ComplexBug20 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug20 subtract(ComplexBug20 x, ComplexBug20 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult(ComplexBug20 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("(" + c.real + "," + c.imaginary + ")");
	}

	public static void main(String[] args) {
		ComplexBug20 c1 = new ComplexBug20(3, -5);
		ComplexBug20 c2 = new ComplexBug20(8, 7);
		ComplexBug20 sum = new ComplexBug20();
		sum.add(c1, c2);
		ComplexBug20 diff = new ComplexBug20();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug20.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug20.printResult(diff);
	}

}