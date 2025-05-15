public class ComplexBug26 {
    
    private int real;
    private int imaginary;
    
    ComplexBug26(){
        this.real = 0;
        this.imaginary = 0;  
    }
    
    ComplexBug26(int x, int y){
        this.real = x;
        this.imaginary = y;  
    }
    
    public ComplexBug26 add(ComplexBug26 x, ComplexBug26 y) {
        this.real = x.real + y.real;
        this.imaginary = x.imaginary + y.imaginary;
        return this;
    }

    public ComplexBug26 subtract(ComplexBug26 x, ComplexBug26 y) {
        this.real = x.real - y.real;
        this.imaginary = x.imaginary - y.imaginary;  
        return this;
    }
    
    public static void printResult(ComplexBug26 c) {
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug26 c1 = new ComplexBug26(3, -5);
        ComplexBug26 c2 = new ComplexBug26(8, 7);
        ComplexBug26 sum = new ComplexBug26();
        sum.add(c1, c2);
        ComplexBug26 diff = new ComplexBug26();
        diff.subtract(c1, c2);
        System.out.println("The sum is ");
        ComplexBug26.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug26.printResult(diff);
    }
}