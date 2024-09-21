package two_pointers;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 21, 2024
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapping water is: " + trap(heights));
    }

    //O(1) space
    private static int trap(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int left = 0;
        int right = heights.length - 1;
        int leftMax = heights[left];
        int rightMax = heights[right];
        int result = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                result += leftMax - heights[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                result += rightMax - heights[right];
            }
        }
        return result;
    }
}
