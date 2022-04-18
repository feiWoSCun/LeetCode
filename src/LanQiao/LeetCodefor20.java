package LanQiao;

import java.util.Stack;
//0 1 2 3
public class LeetCodefor20 {
    public static void main(String[] args) {
        String s="[{}[]]";
        Solution20 so=new Solution20();
        so.isValid(s);
    }
}
class Solution20 {
    public boolean isValid(String s) {
        if(s.length()%2==1)
            return false;
        Stack<Character> myStackLeft=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(myStackLeft.isEmpty()){
                myStackLeft.push(s.charAt(i));
continue;
            }
           if (
                   (myStackLeft.peek()=='['&&s.charAt(i)==']')||
                           (myStackLeft.peek()=='('&&s.charAt(i)==')')||
                           (myStackLeft.peek()=='{'&&s.charAt(i)=='}')
           ){
                myStackLeft.push(s.charAt(i));
                myStackLeft.pop();
                myStackLeft.pop();
                continue;
            }
            myStackLeft.push(s.charAt(i));
        }
        return myStackLeft.isEmpty()?true:false;
    }
}
