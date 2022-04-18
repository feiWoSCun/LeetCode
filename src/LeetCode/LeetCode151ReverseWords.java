package LeetCode;

public class LeetCode151ReverseWords {
    public static void main(String[] args) {

        Solution123 s = new Solution123();
        String test = "  a good   example  ";
        String str=s.reverseWords(test);
        System.out.println(str);
    }
}
class Solution123 {
    public String reverseWords(String s) {
        char[] help = s.toCharArray();
        char[] ans = reverseString(help, 0, help.length - 1);
        int first = 0;
        int next = -1;
        while (first <= ans.length-1) {
            while (first<=ans.length-1&&ans[first] == ' ') {
                next = (++first);
            }
            while ((++next)<=ans.length-1&&ans[next] != ' ') {
            }
            if(next==ans.length) {
                next--;
                reverseString(ans, first, next);
                break;
            }
            reverseString(ans, first, next-1);
            first = next;
        }
        int point = 0;
        int last = ans.length - 1;
        while (ans[point] == ' ') {
            point++;
        }
        while (ans[last] == ' ') {
            last--;
        }
        int count = 0;
        for (int i = point; i < last; i++) {
            if (ans[i] == ans[i + 1] && ans[i] == ' ') {
                count++;
            }
        }
        char[] end = new char[last - point + 1 -count];
        int lastPoint = 0;
        for (int i = point; i < last; i++) {
            while (ans[i] == ans[i + 1] && ans[i] == ' ') {
               i++;
            }
            end[lastPoint++] = ans[i];
            if(i+1==last)
                end[lastPoint]=ans[last];
        }
        end[lastPoint]=ans[last];
String myAnswer=new String(end);
        return myAnswer;
    }
    public char[] reverseString(char[] s, int first, int last) {
        while (true) {
            if (first == last)
                break;
            s[first] = (char) (s[first] ^ s[last]);
            s[last] = (char) (s[first] ^ s[last]);
            s[first] = (char) (s[first] ^ s[last]);
            if (first + 1 == last) {
                break;
            }
            first++;
            last--;

        }
        return s;
    }
}