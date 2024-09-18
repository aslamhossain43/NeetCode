package arrays_and_hashing;

import java.util.Arrays;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 18, 2024
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Product except self is: " + Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 1;
        int right = 1;
        // Step 1: Left Pass
        // Initialize the first element as 1 because there are no elements to the left of the first element
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        // Step 2: Right Pass
        // Initialize a variable to store the product of elements to the right of the current element
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
