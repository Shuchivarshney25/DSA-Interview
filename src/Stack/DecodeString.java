package Stack;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();   // to store repeat counts
        Stack<String> strStack = new Stack<>();    // to store previous strings
        String current = "";                       // current building string
        int num = 0;                               // current number

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build number (handle multi-digit like 12[a])
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                // Push the current number and string, then reset
                numStack.push(num);
                strStack.push(current);
                num = 0;
                current = "";
            }
            else if (ch == ']') {
                // Pop from stacks and build the decoded substring
                int repeatTimes = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(current);
                }
                current = temp.toString();
            }
            else {
                // It's a letter — add it to the current string
                current += ch;
            }
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));   // Output: accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef")); // Output: abcabccdcdcdef
        System.out.println(decodeString("10[a]")); // Output: aaaaaaaaaa

    }
}
