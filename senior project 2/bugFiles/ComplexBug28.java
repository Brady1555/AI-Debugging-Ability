public class ComplexBug28 {
    
    private int real;
    private int imaginary;
    
    public ComplexBug28() {
        this.real = 0;
        this.imaginary = 0;  
    }
    
    public ComplexBug28(int x, int y) {
        this.real = x;
        this.imaginary = y;  
    }
    
    public ComplexBug28 add(ComplexBug28 x, ComplexBug28 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug28 subtract(ComplexBug28 x, ComplexBug28 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
        return this;
    }
    
    public static void printResult(ComplexBug28 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug28 c1 = new ComplexBug28(3, -5);
        ComplexBug28 c2 = new ComplexBug28(8, 7);
        
        ComplexBug28 sum = new ComplexBug28();
        sum.add(c1, c2);
        
        ComplexBug28 diff = new ComplexBug28();
        diff.subtract(c1, c2);
        
        System.out.println("The sum is ");
        ComplexBug28.printResult(sum);
        
        System.out.println("The difference is ");
        ComplexBug28.printResult(diff);
    }
}