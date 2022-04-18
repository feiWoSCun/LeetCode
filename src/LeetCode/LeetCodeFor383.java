package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeFor383 {
    public static void main(String[] args) {

    String s="a";
    String str= "b";
Solution383.canConstruct(s,str);
}
class Solution383 {
 /*   public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
            return false;
int[] help=new int[126];
char[] chars=new char[ransomNote.length()+magazine.length()];
char[] end=ransomNote.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            chars[i]=end[i];
        }
char[] ans=magazine.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            help[chars[i]]++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            help[ans[i]]--;
        }
        boolean a=true;
        for (int i = 0; i < help.length; i++) {
            if(help[i]>0)
            a=false;
        }
        return  a;
    }*/
//hashMap
public static boolean canConstruct(String ransomNote, String magazine) {
    if(magazine.length()<ransomNote.length())
        return  false;
    Map<Character,Integer> hash=new HashMap<>();
    char[] help=ransomNote.toCharArray();
    char[] temp=magazine.toCharArray();
    int a=0;
    for (int i = 0; i < ransomNote.length(); i++) {
        hash.put(help[i],hash.containsKey(help[i])?hash.get(help[i])+1:1);
    }
    for (int i = 0; i < magazine.length(); i++) {
    if(hash.containsKey(temp[i]))
        hash.put(help[i],hash.get(help[i])-1);
}
 for(Map.Entry<Character,Integer> entry:hash.entrySet()){
 if(entry.getValue()>0)
 return  false;
 }
 return true;
}

}}