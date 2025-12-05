package Arrays_LinkedLists.Arrays;

import java.util.Arrays;

public class trippletSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(findTriplet(arr, 13));
    }
    public static boolean findTriplet(int[] arr, int target) {
    int n = arr.length;
    Arrays.sort(arr);

    for (int i = 0; i < n - 2; i++) {
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];

            if (sum == target) {
                return true;   // Triplet found
            } else if (sum < target) {
                left++;        // Need bigger sum
            } else {
                right--;       // Need smaller sum
            }
        }
    }
    return false;  // No triplet found
}

}
