package two_pointers;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 19, 2024
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
