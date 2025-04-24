public class Complex {
	
	private int real;
	private int imaginary;
	
	Complex(){
		this.real = 0;
        this.imaginary = 0;  
	
	}
	
	Complex(int x, int y){
		real = x;
        imaginary = y;  
	
	}
	
	public Complex add (Complex x, Complex y) {
		this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
		return this;
	}

	public Complex subtract (Complex x, Complex y) {
		this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
		return this;
	}
	
	public static void printResult (Complex c) {
		// displays the real and imaginary parts of the complex number.  
		System.out.println("("+c.real+","+c.imaginary+")");
		
	}

	public static void main(String[]args) {
		Complex c1= new Complex(3, -5);
		Complex c2= new Complex(8, 7);
		Complex sum = new Complex();
		sum.add(c1, c2);
		Complex diff = new Complex();
		diff.subtract(c1, c2);
		System.out.println("The sum is ");
		Complex.printResult(sum);
		System.out.println("The difference is ");
		Complex.printResult(diff);
	}

}