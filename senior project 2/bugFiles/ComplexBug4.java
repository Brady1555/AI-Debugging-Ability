public class ComplexBug4 {
    
    private int real;
    private int imaginary;
    
    ComplexBug4(){
        this.real = 0;
        this.imaginary = 0;  
    }
    
    ComplexBug4(int x, int y){
        real = x;
        imaginary = y;  
    }
    
    // Instance methods for adding/subtracting a complex number and returning new result
    public ComplexBug4 add(ComplexBug4 other) {
        return new ComplexBug4(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexBug4 subtract(ComplexBug4 other) {
        return new ComplexBug4(this.real - other.real, this.imaginary - other.imaginary);
    }
    
    public static void printResult(ComplexBug4 c) {
        // displays the real and imaginary parts of the complex number.  
        System.out.println("(" + c.real + "," + c.imaginary + ")");
    }

    public static void main(String[] args) {
        ComplexBug4 c1 = new ComplexBug4(3, -5);
        ComplexBug4 c2 = new ComplexBug4(8, 7);
        
        ComplexBug4 sum = c1.add(c2);
        ComplexBug4 diff = c1.subtract(c2);
        
        System.out.println("The sum is ");
        ComplexBug4.printResult(sum);
        System.out.println("The difference is ");
        ComplexBug4.printResult(diff);
    }
}