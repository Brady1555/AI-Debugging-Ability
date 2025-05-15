public class ComplexBug15 {

    private int real;
    private int imaginary;

    ComplexBug15() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug15(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public ComplexBug15 add(ComplexBug15 other) {
        return new ComplexBug15(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexBug15 subtract(ComplexBug15 other) {
        return new ComplexBug15(this.real - other.real, this.imaginary - other.imaginary);
    }

    public static void printResult(ComplexBug15 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug15 c1 = new ComplexBug15(3, -5);
        ComplexBug15 c2 = new ComplexBug15(8, 7);

        ComplexBug15 sum = c1.add(c2);
        ComplexBug15 diff = c1.subtract(c2);

        System.out.println("The sum is ");
        ComplexBug15.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug15.printResult(diff);
    }
}