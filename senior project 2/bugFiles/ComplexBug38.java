public class ComplexBug38 {
	
	private int real;
	private int imaginary;
	
	ComplexBug38(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug38(int x, int y){
		rel = x;
        imaginary = y;  
	
	}
	
	public ComplexBug38 add (ComplexBug38 x, ComplexBug38 y) {
		this.real = x.rel + y.rel;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug38 subtract (ComplexBug38 x, ComplexBug38 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug38 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug38 c1= new ComplexBug38(3, -5);
		ComplexBug38 c2= new ComplexBug38(8, 7);
		ComplexBug38 sum = new ComplexBug38();
		sum.add(c1, c2);
		ComplexBug38 diff = new ComplexBug38();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug38.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug38.printResult(diff);
	}

}