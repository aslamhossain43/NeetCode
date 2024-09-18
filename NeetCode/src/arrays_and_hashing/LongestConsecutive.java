package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 18, 2024
 */
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive is: " + longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 1;
        for (int num : nums) {
            //check if the num is the start of a sequence by checking if left exists
            if (!set.contains(num - 1)) {// start of a sequence
                int count = 1;
                while (set.contains(num + 1)) {// check if hs contains next no.
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            if (longest > nums.length / 2) {
                break;
            }
        }
        return longest;
    }

}
