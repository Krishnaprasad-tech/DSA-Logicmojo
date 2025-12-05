package Arrays_LinkedLists.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,1,3,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a]; // Use a temporary variable to swap
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void bubble(int[] arr){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    swap(arr,j,j+1);
                    swapped =true;
                }
            }
            if (!swapped) { // If no elements were swapped, the array is sorted
                break;
            }
            }
            
        }

    }
