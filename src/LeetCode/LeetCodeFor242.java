package LeetCode;

public class LeetCodeFor242 {
}
class Solution242 {
    public static void main(String[] args) {
        isAnagram(new String("rat"),new String("cat"));
    }
    public static boolean isAnagram(String s, String t) {
        int[] help=new int[26];
for(int i=0;i<s.length();i++){
    help[s.charAt(i)-'a']++;
}
        for(int i=0;i<t.length();i++){
            help[t.charAt(i)-'a']--;
        }
        int a=25;
        while(a>=0){
            if(help[a--]!=0)
            return false;
        }
        return  true;
    }
}