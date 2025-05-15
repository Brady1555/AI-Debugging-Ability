public class ComplexBug17 {
    private int real;
    private int imaginary;

    // Default constructor
    public ComplexBug17() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public ComplexBug17(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add another complex number to this one and return a new ComplexBug17
    public ComplexBug17 add(ComplexBug17 other) {
        return new ComplexBug17(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtract another complex number from this one and return a new ComplexBug17
    public ComplexBug17 subtract(ComplexBug17 other) {
        return new ComplexBug17(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Display the complex number
    public static void printResult(ComplexBug17 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    // Optional: override toString for easy printing
    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }

    public static void main(String[] args) {
        ComplexBug17 c1 = new ComplexBug17(3, -5);
        ComplexBug17 c2 = new ComplexBug17(8, 7);

        ComplexBug17 sum = c1.add(c2);
        ComplexBug17 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug17.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug17.printResult(diff);
    }
}