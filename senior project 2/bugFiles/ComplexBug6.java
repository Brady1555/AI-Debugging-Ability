public class ComplexBug6 {

    private int real;
    private int imaginary;

    public ComplexBug6() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexBug6(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    // Instance method: adds another complex number to this one
    public ComplexBug6 add(ComplexBug6 other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
        return this;
    }

    // Instance method: subtracts another complex number from this one
    public ComplexBug6 subtract(ComplexBug6 other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
        return this;
    }

    // Static method: prints complex number
    public static void printResult(ComplexBug6 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug6 c1 = new ComplexBug6(3, -5);
        ComplexBug6 c2 = new ComplexBug6(8, 7);

        ComplexBug6 sum = new ComplexBug6(c1.real, c1.imaginary); // copy c1
        sum.add(c2);

        ComplexBug6 diff = new ComplexBug6(c1.real, c1.imaginary); // copy c1
        diff.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug6.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug6.printResult(diff);
    }
}