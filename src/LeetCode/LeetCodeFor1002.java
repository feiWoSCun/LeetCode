package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeFor1002 {

}
class Solution1002 {
    public List<String> commonChars(String[] words) {
List<String> list=new ArrayList<>();
int[] help =new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            help[words[0].charAt(i)-'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] s=new int[26];
            for (int j= 0; j < words[i].length(); j++) {
                s[words[i].charAt(j)-'a']++;
            }
            for (int i1 = 0; i1 < 26; i1++) {
                help[i1]=help[i1]>=s[i1]? s[i1]:help[i1];
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int ans = 1; ans <= help[i]; ans++) {
                char[] c = new char[1];
                c[0] = (char) (i + 97);
                String str = new String(c);
                list.add(str);
            }
        }
           return list;
        }
    }
