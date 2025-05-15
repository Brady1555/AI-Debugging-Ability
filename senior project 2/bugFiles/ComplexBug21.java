public class ComplexBug21 {

    private int real;
    private int imaginary;

    // Default constructor
    ComplexBug21() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    ComplexBug21(int x, int y) {
        this.real = x;
        this.imaginary = y;   // Changed from ":" to ";"
    }

    // Add method - adds two complex numbers and stores result in this object
    public ComplexBug21 add(ComplexBug21 x, ComplexBug21 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    // Subtract method - subtracts y from x and stores result in this object
    public ComplexBug21 subtract(ComplexBug21 x, ComplexBug21 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;
        return this;
    }

    // Prints the complex number in (real, imaginary) format
    public static void printResult(ComplexBug21 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    // Main method to test functionality
    public static void main(String[] args) {
        ComplexBug21 c1 = new ComplexBug21(3, -5);   // Changed ":" to ";"
        ComplexBug21 c2 = new ComplexBug21(8, 7);

        ComplexBug21 sum = new ComplexBug21();
        sum.add(c1, c2);

        ComplexBug21 diff = new ComplexBug21();
        diff.subtract(c1, c2);

        System.out.println("The sum is ");  // Changed ":" to ";"
        ComplexBug21.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug21.printResult(diff);
    }
}