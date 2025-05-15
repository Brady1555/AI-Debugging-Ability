public class ComplexBug23 {
    
    private int real;
    private int imaginary;
    
    // Constructor without parameters
    ComplexBug23() {
        this.real = 0;
        this.imaginary = 0;  
    }
    
    // Constructor with parameters
    ComplexBug23(int x, int y) {
        this.real = x;
        this.imaginary = y;  
    }
    
    // Add two complex numbers and store the result in this instance
    public ComplexBug23 add(ComplexBug23 x, ComplexBug23 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }
    
    // Subtract two complex numbers and store the result in this instance
    public ComplexBug23 subtract(ComplexBug23 x, ComplexBug23 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
        return this;
    }
    
    // Print the complex number in (real, imaginary) format
    public static void printResult(ComplexBug23 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }
    
    public static void main(String[] args) {
        ComplexBug23 c1 = new ComplexBug23(3, -5);
        ComplexBug23 c2 = new ComplexBug23(8, 7);
        ComplexBug23 sum = new ComplexBug23();
        sum.add(c1, c2);
        ComplexBug23 diff = new ComplexBug23();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug23.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug23.printResult(diff);
    }
}