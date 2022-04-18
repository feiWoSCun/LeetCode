package LeetCode;

import java.util.Arrays;

public class ReverseString541 {
    public static void main(String[] args) {

        String s = "abcdefg";
        Solution541.reverseStr(s, 2);

    }

    class Solution541 {
        public static String reverseStr(String s, int k) {
            char[] help = s.toCharArray();
            int first = 0;
            int last = k - 1;
            while (true) {
                int a = first;
                int b = last;
                while (true) {
                    if (a == b)
                        break;
                    help[a] = (char) (help[a] ^ help[b]);
                    help[b] = (char) (help[a] ^ help[b]);
                    help[a] = (char) (help[a] ^ help[b]);
                    if (a + 1 == b) {
                        break;
                    }
                }
                first = first + (k << 1);
                last = first + k - 1 >= help.length - 1 ? help.length - 1 : first + k - 1;
                if (first >= help.length - 1) {
                    break;
                }
            }
            return s = Arrays.toString(help);
        }
    }
}

