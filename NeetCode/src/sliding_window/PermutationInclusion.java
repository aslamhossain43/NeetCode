package sliding_window;

import java.util.Arrays;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 27, 2024
 */
public class PermutationInclusion {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println("Is permutation include: " + checkPermutationInclusion(s1, s2));
    }

    private static boolean checkPermutationInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq1 = new int[26];
        int m = s2.length();
        int[] freq2 = new int[26];
        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
}
