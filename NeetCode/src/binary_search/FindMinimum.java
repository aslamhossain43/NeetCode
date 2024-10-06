package binary_search;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 06, 2024
 */
public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println("Minimum after rotating nums.length times is: " + findMin(nums));
    }

    private static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
}
