package LeetCode;

/*
 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）
 如果不存在，则返回 -1 。
 */
public class sStrToKMP28 {
    public static void main(String[] args) {
        String str = "";
        String s = "abcdabcdabc";
        System.out.println(strStr(str, s));

    }

    public static int strStr(String haystack, String needle) {

        if(needle.length()==0)
         return  0;
        //实现KMP算法
char[] help =haystack.toCharArray();
        char[] chars = needle.toCharArray();
        int[] next = new int[needle.length() ];
        for (int i = 1, j = 0; i <chars.length; i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j - 1];
                //j代表有多少个与它匹配
                //next[j]表示当前最新情况下有多少个和他匹配；
                // 如果不满足当前匹配条件的话，就回退到前一个。
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