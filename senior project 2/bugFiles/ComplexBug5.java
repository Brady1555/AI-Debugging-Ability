public class ComplexBug5 {

    private int real;
    private int imaginary;

    ComplexBug5() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug5(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public ComplexBug5 add(ComplexBug5 x, ComplexBug5 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug5 subtract(ComplexBug5 x, ComplexBug5 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;
        return this;
    }

    public static void printResult(ComplexBug5 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug5 c1 = new ComplexBug5(3, -5);
        ComplexBug5 c2 = new ComplexBug5(8, 7);

        ComplexBug5 sum = new ComplexBug5();
        sum.add(c1, c2);

        ComplexBug5 diff = new ComplexBug5();
        diff.subtract(c1, c2);

        System.out.println("The sum is ");
        ComplexBug5.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug5.printResult(diff);
    }
}