public class ComplexBug10 {

    private int real;
    private int imaginary;

    ComplexBug10() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug10(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public ComplexBug10 add(ComplexBug10 x, ComplexBug10 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug10 subtract(ComplexBug10 x, ComplexBug10 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;
        return this;
    }

    public static void printResult(ComplexBug10 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug10 c1 = new ComplexBug10(3, -5);
        ComplexBug10 c2 = new ComplexBug10(8, 7);
        ComplexBug10 sum = new ComplexBug10();
        sum.add(c1, c2);
        ComplexBug10 diff = new ComplexBug10();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug10.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug10.printResult(diff);
    }
}