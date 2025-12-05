package Arrays_LinkedLists.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};
        sort(arr, 0, arr.length - 1); // Renamed method to 'sort'
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    static void sort(int[] arr, int low, int high) { 
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap the pivot element with the element at i+1
        swap(arr, i + 1, high);
        return i + 1; // Return the pivot index
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}