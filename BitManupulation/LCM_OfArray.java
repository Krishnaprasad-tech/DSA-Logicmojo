public class LCM_OfArray {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8}; // Example array
        System.out.println(findLCM(arr)); // Print the LCM of the array
    }

    // Function to calculate LCM of an array
    public static int findLCM(int[] arr) {
        int lcm = arr[0]; // Start with the first element
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]); // Calculate LCM of current LCM and next element
        }
        return lcm;
    }

    // Helper function to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // LCM formula: (a * b) / GCD(a, b)
    }

    // Helper function to calculate GCD of two numbers using Euclidean algorithm
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        } 
            return gcd(b,a%b);
    }
}