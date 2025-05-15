public class ComplexBug14 {

    private int real;
    private int imaginary;

    public ComplexBug14() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexBug14(int x, int y) {
        this.real = x;
        this.imaginary = y;
    }

    public static ComplexBug14 add(ComplexBug14 x, ComplexBug14 y) {
        return new ComplexBug14(x.real + y.real, x.imaginary + y.imaginary);
    }

    public static ComplexBug14 subtract(ComplexBug14 x, ComplexBug14 y) {
        return new ComplexBug14(x.real - y.real, x.imaginary - y.imaginary);
    }

    public static void printResult(ComplexBug14 c) {
        System.out.println("(" + c.real + ", " + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug14 c1 = new ComplexBug14(3, -5);
        ComplexBug14 c2 = new ComplexBug14(8, 7);

        ComplexBug14 sum = ComplexBug14.add(c1, c2);
        ComplexBug14 diff = ComplexBug14.subtract(c1, c2);

        System.out.println("The sum is ");
        ComplexBug14.printResult(sum);

        System.out.println("The difference is ");
        ComplexBug14.printResult(diff);
    }
}