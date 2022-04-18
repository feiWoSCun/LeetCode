package LeetCode;

public class sStrToKMP28 {
    public static void main(String[] args) {
        String str = "";
        String s = "abcdabcdabc";
        System.out.println(strStr(str, s));

    }

    public static int strStr(String haystack, String needle) {
        //实现KMP算法;
        if(needle.length()==0)
         return  0;
char[] help =haystack.toCharArray();
        char[] chars = needle.toCharArray();
        int[] next = new int[needle.length() ];
        for (int i = 1, j = 0; i < needle.length(); i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j - 1];
            }
            if (chars[i] == chars[j]) {
                next[i] = ++j;
            }
        }
        //进行匹配;
        //aabaacd
        //aacd
        for (int i1 = 0, j1 = 0; i1 < help.length; i1++) {
            while (j1>0&&help[i1]!=chars[j1]){
                j1=next[j1-1];
            }
if(help[i1]==chars[j1]) {
    j1++;
}
    if(j1==needle.length())
        return i1-(j1-1);

        }
        return -1;

        }
    }