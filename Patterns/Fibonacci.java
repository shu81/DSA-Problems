public class Fibonacci {

    
    public static int FibonacciRecursion(int n) {
        if (n <= 1) {
            return n;  
        }
        return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2); 
    }

    public static void main(String args[]) {
        int n = 5;  
        System.out.println("Fibonacci number at position " + n + " is: " + FibonacciRecursion(n));
    }
}
