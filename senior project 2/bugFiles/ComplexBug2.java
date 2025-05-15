public class ComplexBug2 {

    private int real;
    private int imaginary;

    ComplexBug2() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug2(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public ComplexBug2 add(ComplexBug2 x, ComplexBug2 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug2 subtract(ComplexBug2 x, ComplexBug2 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;
        return this;
    }

    // Fix: changed [ComplexBug2 c) to (ComplexBug2 c)
    public static void printResult(ComplexBug2 c) {
        // displays the real and imaginary parts of the complex number.
        // Changed "[" and ")" to be consistent brackets
        System.out.println("[" + c.real + "," + c.imaginary + "]");
    }

    public static void main(String[] args) {
        ComplexBug2 c1 = new ComplexBug2(3, -5);
        ComplexBug2 c2 = new ComplexBug2(8, 7);

        ComplexBug2 sum = new ComplexBug2();
        sum.add(c1, c2);

        ComplexBug2 diff = new ComplexBug2();
        diff.subtract(c1, c2);

        System.out.println("The sum is ");
        // Fixed: Changed printResult[sum) to printResult(sum);
        ComplexBug2.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug2.printResult(diff);
    }
}