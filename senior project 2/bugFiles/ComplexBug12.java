public class ComplexBug12 {

    private int real;
    private int imaginary;

    // Default constructor
    public ComplexBug12() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public ComplexBug12(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    // Returns a new ComplexBug12 representing the sum
    public ComplexBug12 add(ComplexBug12 other) {
        return new ComplexBug12(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Returns a new ComplexBug12 representing the difference
    public ComplexBug12 subtract(ComplexBug12 other) {
        return new ComplexBug12(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Prints the complex number
    public static void printResult(ComplexBug12 c) {
        System.out.println("(" + c.real + ", " + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug12 c1 = new ComplexBug12(3, -5);
        ComplexBug12 c2 = new ComplexBug12(8, 7);

        ComplexBug12 sum = c1.add(c2);
        ComplexBug12 diff = c1.subtract(c2);

        System.out.println("The sum is:");
        ComplexBug12.printResult(sum);

        System.out.println("The difference is:");
        ComplexBug12.printResult(diff);
    }
}