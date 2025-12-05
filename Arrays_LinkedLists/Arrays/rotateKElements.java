package Arrays_LinkedLists.Arrays;

public class rotateKElements {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int[] result = InnerRotateKElements(num, 3);

        System.out.println(java.util.Arrays.toString(result));
    }
    public static int[] InnerRotateKElements(int[] nums,int k) {
        int n = nums.length;
        k = k%n;//k should be +ve always
        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse rest (n-k) elements
        reverse(nums, k, n - 1);
        
        return nums;
    }
    public static void reverse(int[] num,int start,int end){
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
