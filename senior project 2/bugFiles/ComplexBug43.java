public class ComplexBug43 {
	
	private int real;
	private int imaginary;
	
	ComplexBug43(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug43(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug43 add (ComplexBug43 x, ComplexBug43 y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug43 subtract (ComplexBug43 x, ComplexBug43 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug43 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		ComplexBug43 c1= new ComplexBug43(3, -5);
		ComplexBug43 c2= new ComplexBug43(8, 7);
		ComplexBug43 sum = new ComplexBug43();
		sum.add(c1, c2);
		ComplexBug43 difff = new ComplexBug43();
		difff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug43.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug43.printResult(difff);
	}

}