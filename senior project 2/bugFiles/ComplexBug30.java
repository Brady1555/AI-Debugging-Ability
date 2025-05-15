public class ComplexBug30 {

    private int real;
    private int imaginary;

    ComplexBug30() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug30(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Adds another complex number to this one and returns the result as a new ComplexBug30
    public ComplexBug30 add(ComplexBug30 other) {
        return new ComplexBug30(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtracts another complex number from this one and returns the result as a new ComplexBug30
    public ComplexBug30 subtract(ComplexBug30 other) {
        return new ComplexBug30(this.real - other.real, this.imaginary - other.imaginary);
    }

    public static void printResult(ComplexBug30 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug30 c1 = new ComplexBug30(3, -5);
        ComplexBug30 c2 = new ComplexBug30(8, 7);

        ComplexBug30 sum = c1.add(c2);
        ComplexBug30 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        printResult(sum);

        System.out.println("The difference is ");
        printResult(diff);
    }
}