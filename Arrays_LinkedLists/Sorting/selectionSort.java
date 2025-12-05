package Arrays_LinkedLists.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};
        selection(arr);
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index is the minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, i, minIndex);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}