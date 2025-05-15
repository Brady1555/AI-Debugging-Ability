public class ComplexBug18 {

    private int real;
    private int imaginary;

    ComplexBug18() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug18(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    // Instance method that adds another complex number and returns a new object
    public ComplexBug18 add(ComplexBug18 other) {
        return new ComplexBug18(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Instance method that subtracts another complex number and returns a new object
    public ComplexBug18 subtract(ComplexBug18 other) {
        return new ComplexBug18(this.real - other.real, this.imaginary - other.imaginary);
    }

    public static void printResult(ComplexBug18 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug18 c1 = new ComplexBug18(3, -5);
        ComplexBug18 c2 = new ComplexBug18(8, 7);

        ComplexBug18 sum = c1.add(c2);
        ComplexBug18 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug18.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug18.printResult(diff);
    }
}