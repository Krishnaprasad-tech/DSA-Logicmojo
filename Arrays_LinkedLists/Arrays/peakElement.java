package Arrays_LinkedLists.Arrays;

public class peakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums)); // can print 1 or 5
    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while(l<r){
            int mid = l + (r - l) / 2;

            // If right neighbor is bigger, peak lies on the right side
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                // nums[mid] >= nums[mid + 1]
                // Peak lies on the left side (including mid)
                r = mid;
            }
        }

        // l == r -> index of a peak
        return l;
    }
}
