public class ComplexBug47 
	
	private int real;
	private int imaginary;
	
	ComplexBug47(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	ComplexBug47(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public ComplexBug47 add (ComplexBug47 x, ComplexBug47 y) 
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public ComplexBug47 subtract (ComplexBug47 x, ComplexBug47 y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (ComplexBug47 c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) 
		ComplexBug47 c1= new ComplexBug47(3, -5);
		ComplexBug47 c2= new ComplexBug47(8, 7);
		ComplexBug47 sum = new ComplexBug47();
		sum.add(c1, c2);
		ComplexBug47 diff = new ComplexBug47();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		ComplexBug47.printResult(sum);
		System.out.println("The difference is ");
		ComplexBug47.printResult(diff);
	}

}