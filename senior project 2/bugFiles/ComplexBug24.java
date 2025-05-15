public class ComplexBug24 {
    
    private int real;
    private int imaginary;
    
    ComplexBug24() {
        this.real = 0;
        this.imaginary = 0;  
    }
    
    ComplexBug24(int x, int y) {
        this.real = x;         // Use = for assignment, not ==
        this.imaginary = y;    // Use = for assignment, not ==
    }
    
    public ComplexBug24 add(ComplexBug24 x, ComplexBug24 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug24 subtract(ComplexBug24 x, ComplexBug24 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  // Use =, not ==
        return this;
    }
    
    public static void printResult(ComplexBug24 c) {
        // displays the real and imaginary parts of the complex number.  
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug24 c1 = new ComplexBug24(3, -5);
        ComplexBug24 c2 = new ComplexBug24(8, 7);
        ComplexBug24 sum = new ComplexBug24();
        sum.add(c1, c2);
        ComplexBug24 diff = new ComplexBug24();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug24.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug24.printResult(diff);
    }
}