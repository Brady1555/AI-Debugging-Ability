public class ComplexBug32 {
    
    private int real;
    private int imaginary;
    
    // Default constructor
    public ComplexBug32() {
        this.real = 0;
        this.imaginary = 0;  
    }
    
    // Parameterized constructor
    public ComplexBug32(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;  
    }
    
    // Add method returns a new ComplexBug32 that is the sum of this and other
    public ComplexBug32 add(ComplexBug32 other) {
        return new ComplexBug32(this.real + other.real, this.imaginary + other.imaginary);
    }
    
    // Subtract method returns a new ComplexBug32 that is the difference of this and other
    public ComplexBug32 subtract(ComplexBug32 other) {
        return new ComplexBug32(this.real - other.real, this.imaginary - other.imaginary);
    }
    
    // Print method
    public static void printResult(ComplexBug32 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    // Optional: override toString for easier printing
    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }
    
    public static void main(String[] args) {
        ComplexBug32 c1 = new ComplexBug32(3, -5);
        ComplexBug32 c2 = new ComplexBug32(8, 7);
        
        ComplexBug32 sum = c1.add(c2);
        ComplexBug32 diff = c1.subtract(c2);
        
        System.out.println("The sum is ");
        ComplexBug32.printResult(sum);
        
        System.out.println("The difference is ");
        ComplexBug32.printResult(diff);
        
        // Or simply use toString
        System.out.println("Sum using toString(): " + sum);
        System.out.println("Difference using toString(): " + diff);
    }
}