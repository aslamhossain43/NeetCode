package two_pointers;

import java.util.Arrays;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 20, 2024
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two sum is: " + Arrays.toString(twoSum(numbers, target)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;
        int num_a;
        int num_b;
        while (a_pointer < b_pointer) {
            num_a = numbers[a_pointer];
            num_b = numbers[b_pointer];
            if (num_a + num_b == target) {
                break;
            }
            if (num_a + num_b < target) {//ascending/non-decreasing array
                a_pointer++;
                continue;
            }
            b_pointer--;
        }
        return new int[]{a_pointer + 1, b_pointer + 1};
    }
}
