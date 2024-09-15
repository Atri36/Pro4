package Pro4;

public class SwapNumbers {
    public static void main(String[] args) {
        // Initialize two numbers
        int a = 5;
        int b = 10;
        
        // Print original values
        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swap numbers using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        // Print swapped values
        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
