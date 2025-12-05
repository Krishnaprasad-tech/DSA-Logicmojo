package Arrays_LinkedLists.Arrays;


import java.util.Arrays;

public class closestCurrSumto0 {
    public static void main(String[] args) {
        //int[] arr = {1,-1,2,3,4,-5};
        int[] arr = {-8, -66, -60};
        System.out.println(closestSum(arr));
    }
    public static int closestSum(int[] arr){
        Arrays.sort(arr);
        int l = 0,r=arr.length-1;
        int closestSum = Integer.MAX_VALUE;

        while (l<r) {
            int currSum = arr[l]+arr[r];
            // Update if:
            // 1) strictly closer to zero, OR
            // 2) same distance from zero but currSum is greater (prefer positive)
            if (Math.abs(currSum) < Math.abs(closestSum) ||(Math.abs(currSum) == Math.abs(closestSum) && currSum > closestSum)) {
                closestSum = currSum;
            }
            if(currSum<0) l++;
            else r--;
        }
        return closestSum;
    }
}
