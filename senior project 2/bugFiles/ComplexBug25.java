public class ComplexBug25 {
	
	private int real;
	private int imaginary;
	
	ComplexBug25(){
		this.real = 0;
        this.imaginary = 0;  
	}
	
	ComplexBug25(int x, int y){
		this.real = x;
        this.imaginary = y;  
	}
	
	// Adds the given complex number to this one and returns the result as a new object
	public ComplexBug25 add(ComplexBug25 other) {
		return new ComplexBug25(this.real + other.real, this.imaginary + other.imaginary);
	}

	// Subtracts the given complex number from this one and returns the result as a new object
	public ComplexBug25 subtract(ComplexBug25 other) {
		return new ComplexBug25(this.real - other.real, this.imaginary - other.imaginary);
	}
	
	@Override
	public String toString() {
		return "(" + real + "," + imaginary + ")";
	}

	public static void main(String[]args) {
		ComplexBug25 c1 = new ComplexBug25(3, -5);
		ComplexBug25 c2 = new ComplexBug25(8, 7);

		ComplexBug25 sum = c1.add(c2);
		ComplexBug25 diff = c1.subtract(c2);

		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + diff);
	}
}