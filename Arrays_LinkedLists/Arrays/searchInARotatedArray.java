package Arrays_LinkedLists.Arrays;

public class searchInARotatedArray {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half [l..mid] is sorted
            if (nums[l] <= nums[mid]) {
                // Target lies in sorted left half?
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // Right half [mid..r] is sorted
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target)); // output: 4
    }
}

