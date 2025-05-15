public class ComplexBug11 {
    
    private int real;
    private int imaginary;
    
    ComplexBug11() {
        this.real = 0;
        this.imaginary = 0;  
    }
    
    ComplexBug11(int x, int y) {
        real = x;
        imaginary = y;  
    }
    
    public ComplexBug11 add(ComplexBug11 x, ComplexBug11 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug11 subtract(ComplexBug11 x, ComplexBug11 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
        return this;
    }
    
    public static void printResult(ComplexBug11 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug11 c1 = new ComplexBug11(3, -5);
        ComplexBug11 c2 = new ComplexBug11(8, 7);
        ComplexBug11 sum = new ComplexBug11();
        sum.add(c1, c2);
        ComplexBug11 diff = new ComplexBug11();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug11.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug11.printResult(diff);
    }
}