public class ComplexBug19 {

    private int real;
    private int imaginary;

    // Default constructor
    ComplexBug19() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    ComplexBug19(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add another complex number to this one and return the result as a new object
    public ComplexBug19 add(ComplexBug19 other) {
        return new ComplexBug19(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtract another complex number from this one and return the result as a new object
    public ComplexBug19 subtract(ComplexBug19 other) {
        return new ComplexBug19(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Print the complex number in (real, imaginary) format
    public static void printResult(ComplexBug19 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug19 c1 = new ComplexBug19(3, -5);
        ComplexBug19 c2 = new ComplexBug19(8, 7);

        ComplexBug19 sum = c1.add(c2);
        ComplexBug19 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug19.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug19.printResult(diff);
    }
}