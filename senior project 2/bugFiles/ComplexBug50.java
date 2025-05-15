public class ComplexBug50 {
	
	private int real;
	private int imaginary;
	
	ComplexBug50(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug50(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug50 add (ComplexBug50 x, ComplexBug50 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug50 subtract (ComplexBug50 x, ComplexBug50 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug50 c) {
		// displaysmcvnthe real and imaginary parts of the complex number. mcvn
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	publicmcvnstatic void main(String[]args) {
		ComplexBug50 c1= new ComplexBug50(3, -5);
		ComplexBug50 c2= new ComplexBug50(8, 7);
		ComplexBug50 sum = new ComplexBug50();
		sum.add(c1, c2);
		ComplexBug50 diff = new ComplexBug50();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug50.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug50.printResult(diff);
	}

}