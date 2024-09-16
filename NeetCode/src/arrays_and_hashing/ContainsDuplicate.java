package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 16, 2024
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 8, 4, 5, 6, 3};
        System.out.println("Is Duplicate: " + containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (Integer integer : nums) {
            if (uniques.contains(integer)) {
                return true;
            }
            uniques.add(integer);
        }
        return false;
    }
}
