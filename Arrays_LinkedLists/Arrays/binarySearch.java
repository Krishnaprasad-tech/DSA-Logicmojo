package Arrays_LinkedLists.Arrays;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; // Example sorted array
        int target = 5; // Element to search for
        int result = binarySearch1(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Binary Search function
    public static int binarySearch1(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2; // Calculate the middle index

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}