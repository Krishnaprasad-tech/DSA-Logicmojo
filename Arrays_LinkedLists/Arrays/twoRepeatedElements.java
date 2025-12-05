package Arrays_LinkedLists.Arrays;

import java.util.Arrays;

public class twoRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 6, 2};
        int[] ans = indexApproach(arr);
        System.out.println(Arrays.toString(ans)); 
    }
    public static int[] indexApproach(int[] arr){
            int nPlus2 = arr.length;
            int[] result = new int[2];
            int k = 0;
    
            for (int i = 0; i < nPlus2; i++) {
                int index = Math.abs(arr[i]);   // value itself is the index
                // If already negative, this is the second appearance
                if (arr[index] < 0) {
                    result[k++] = index;        // store repeating number
                    if (k == 2) break;          // we found both, can stop
                } else {
                    arr[index] = -arr[index];   // mark as visited
                }
            }
    
            return result;
        
    }
}
