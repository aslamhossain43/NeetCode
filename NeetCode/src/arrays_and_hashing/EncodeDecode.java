package arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 18, 2024
 */
public class EncodeDecode {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        System.out.println("Encoded is: " + encode(strs));
        System.out.println("Decoded is: " + decode(encode(strs)));

    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            strs.add(str.substring(j + 1, i));
        }
        return strs;
    }


}
