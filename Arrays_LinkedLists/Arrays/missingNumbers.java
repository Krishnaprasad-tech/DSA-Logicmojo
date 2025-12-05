package Arrays_LinkedLists.Arrays;

public class missingNumbers {
    public static int missingNumber(int[] nums) {
            int  n = nums.length+1 ,xorOfNumber=0;
            for(int i=0;i<n;i++){
                xorOfNumber^=i;
            }
            for(int num: nums) {
                xorOfNumber^= num;
            }
            return xorOfNumber;
        }
    
        public static void main(String[] args) {
            int[] arr = {0,2};
            System.out.println(missingNumber(arr));
    }
}