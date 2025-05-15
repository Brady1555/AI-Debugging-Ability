public class ComplexBug16 {
    private int real;
    private int imaginary;

    ComplexBug16() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexBug16(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public static ComplexBug16 add(ComplexBug16 x, ComplexBug16 y) {
        return new ComplexBug16(x.real + y.real, x.imaginary + y.imaginary);
    }

    public static ComplexBug16 subtract(ComplexBug16 x, ComplexBug16 y) {
        return new ComplexBug16(x.real - y.real, x.imaginary - y.imaginary);
    }

    public static void printResult(ComplexBug16 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug16 c1 = new ComplexBug16(3, -5);
        ComplexBug16 c2 = new ComplexBug16(8, 7);
        ComplexBug16 sum = ComplexBug16.add(c1, c2);
        ComplexBug16 diff = ComplexBug16.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug16.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug16.printResult(diff);
    }
}