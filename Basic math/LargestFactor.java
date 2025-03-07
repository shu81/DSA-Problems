public class LargestFactor {

    // Function to find the largest factor of a number
    public static int largestFactor(int num) {
        int largest = 1;  // 1 is always a factor of any number
        // Loop from 2 to sqrt(num) and check for factors
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                largest = i; // i is a factor
                // Check if num / i is a factor and greater than the current largest
                if (i != num / i) {
                    largest = Math.max(largest, num / i);
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        // Example number
        int num = 36;

        // Calling the largestFactor function
        int result = largestFactor(num);
        
        // Output the result
        System.out.println("The largest factor of " + num + " is " + result);
    }
}
