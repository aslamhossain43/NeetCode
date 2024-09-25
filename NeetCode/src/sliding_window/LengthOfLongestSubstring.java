package sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 25, 2024
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring is: " + lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        List<Character> characters = new ArrayList<>();
        int largestLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (characters.contains(s.charAt(right))) {
                int index = characters.indexOf(s.charAt(right));
                characters.remove(index);
                if (index > 0) {
                    characters.subList(0, index).clear();
                }
            }
            characters.add(s.charAt(right));
            largestLength = Math.max(largestLength, characters.size());
        }
        return largestLength;
    }
}
