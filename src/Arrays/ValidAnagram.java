package Arrays;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] stringFirst = s.toCharArray();
        char[] stringSecond = t.toCharArray();
        Arrays.sort(stringFirst);
        Arrays.sort(stringSecond);
        return stringFirst == stringSecond;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));

    }
}
