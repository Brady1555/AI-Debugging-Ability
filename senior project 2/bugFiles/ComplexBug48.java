public class ComplexBug48 {
	
	private int real;
	private int imaginary;
	
	ComplexBug48(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug48(int x, int y){
		real = x;
        imaginary =y;  
	
	}
	
	public ComplexBug48add (ComplexBug48 x, ComplexBug48 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug48 subtract (ComplexBug48 x, ComplexBug48 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug48 c) {
		// displays the real and imaginary partsof the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug48 c1= new ComplexBug48(3, -5);
		ComplexBug48 c2= new ComplexBug48(8, 7);
		ComplexBug48 sum = new ComplexBug48();
		sum.add(c1, c2);
		ComplexBug48 diff = new ComplexBug48();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug48.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug48.printResult(diff);
	}

}