package SlidingWindow;

import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
       int maxTillYet = 1;
       int  i = 0, j =1;
       int[] freq = new int[128];

       while (j < s.length()){
           freq[s.charAt(j)]++;

           while (freq[s.charAt(j)] > 1){
               freq[s.charAt(j)]--;
               i++;
           }

           maxTillYet = Math.max(maxTillYet, j - i + 1);
           j++;

       }
       return maxTillYet;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
