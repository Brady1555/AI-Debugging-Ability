public class ComplexBug37 {
	
	private int real;
	private int imaginary;
	
	ComplexBug37(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug37(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug37 add (ComplexBug37 x, ComplexBug37 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug37 substract (ComplexBug37 x, ComplexBug37 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug37 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug37 c1= new ComplexBug37(3, -5);
		ComplexBug37 c2= new ComplexBug37(8, 7);
		ComplexBug37 sum = new ComplexBug37();
		sum.add(c1, c2);
		ComplexBug37 diff = new ComplexBug37();
		diff.substract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug37.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug37.printResult(diff);
	}

}