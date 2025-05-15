public class ComplexBug22 {

    private int real;
    private int imaginary;

    // Default constructor
    ComplexBug22() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    ComplexBug22(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    // Add two complex numbers and return the result
    public ComplexBug22 add(ComplexBug22 x, ComplexBug22 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    // Subtract y from x and return the result
    public ComplexBug22 subtract(ComplexBug22 x, ComplexBug22 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;
        return this;
    }

    // Print the complex number in (real, imaginary) format
    public static void printResult(ComplexBug22 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug22 c1 = new ComplexBug22(3, -5);
        ComplexBug22 c2 = new ComplexBug22(8, 7);
        ComplexBug22 sum = new ComplexBug22();
        sum.add(c1, c2);
        ComplexBug22 diff = new ComplexBug22();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug22.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug22.printResult(diff);
    }
}