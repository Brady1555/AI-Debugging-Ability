public class ComplexBug31 {
    private int real;
    private int imaginary;

    public ComplexBug31() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexBug31(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add the current complex number with another and return the result
    public ComplexBug31 add(ComplexBug31 other) {
        return new ComplexBug31(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtract another complex number from the current one and return the result
    public ComplexBug31 subtract(ComplexBug31 other) {
        return new ComplexBug31(this.real - other.real, this.imaginary - other.imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }

    public static void main(String[] args) {
        ComplexBug31 c1 = new ComplexBug31(3, -5);
        ComplexBug31 c2 = new ComplexBug31(8, 7);

        ComplexBug31 sum = c1.add(c2);
        ComplexBug31 diff = c1.subtract(c2);

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + diff);
    }
}