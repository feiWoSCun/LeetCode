package LeetCode;
public class KMPFor459 {
}
class Solution459 {
    public static void main(String[] args) {
        String s = "abac";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        char[] help = s.toCharArray();
        if (help.length == 2 && help[0] == help[1])
            return true;
        char[] chars = s.toCharArray();
        int[] next = new int[s.length()];
        for (int i = 1, j = 0; i <chars.length; i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j - 1];
            }
            //j表示的是有j个和next[i-1]匹配
            if (chars[i] == chars[j]) {
                next[i] = ++j;
            }
        }
        int a = chars.length - 1;
        int max = next[a];
        if (max == 0 || chars[a] != chars[a - max])
            return false;
        return chars.length % (chars.length - max) == 0;
    }
}