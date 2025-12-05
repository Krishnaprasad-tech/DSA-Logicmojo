public class oddOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3,2}; // Example array where 3 occurs odd times
        System.out.println(findOddOccurrence(arr)); // Print the element that occurs odd times
    }

    // Function to find the element that occurs odd times
    public static int findOddOccurrence(int[] arr) {
        int result = 0; // Initialize result to 0
        for (int num : arr) {
            result ^= num; // XOR all elements
        }
        return result; // The result will be the element that occurs odd times
    }
}
