public class ComplexBug42 {
	
	private int real;
	private int imaginary;
	
	ComplexBug42(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	complicatedBug42(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug42 add (ComplexBug42 x, ComplexBug42 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public complicatedBug42 subtract (ComplexBug42 x, complicatedBug42 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug42 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug42 c1= new ComplexBug42(3, -5);
		ComplexBug42 c2= new ComplexBug42(8, 7);
		ComplexBug42 sum = new ComplexBug42();
		sum.add(c1, c2);
		ComplexBug42 diff = new ComplexBug42();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug42.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug42.printResult(diff);
	}

}