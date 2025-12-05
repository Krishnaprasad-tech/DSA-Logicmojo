package Arrays_LinkedLists.Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};
        insertion(arr);
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
    }
}
