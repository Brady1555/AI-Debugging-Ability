public class ComplexBug29 {
    private int real;
    private int imaginary;

    // Default constructor
    public ComplexBug29() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Constructor with parameters
    public ComplexBug29(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Adds another complex number to this one and returns the result as a new object
    public ComplexBug29 add(ComplexBug29 other) {
        return new ComplexBug29(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtracts another complex number from this one and returns the result as a new object
    public ComplexBug29 subtract(ComplexBug29 other) {
        return new ComplexBug29(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Prints the complex number
    public static void printResult(ComplexBug29 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    // Main method
    public static void main(String[] args) {
        ComplexBug29 c1 = new ComplexBug29(3, -5);
        ComplexBug29 c2 = new ComplexBug29(8, 7);

        ComplexBug29 sum = c1.add(c2);
        ComplexBug29 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug29.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug29.printResult(diff);
    }
}