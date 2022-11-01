package LeetCode;

import java.util.Stack;

public class LeetCodeFor1047 {
    public static void main(String[] args) {
        String str = "aaaaaaaaaa";
        Solution1047 s = new Solution1047();
 Solution1047.removeDuplicates(str);
    }
}
class Solution1047 {
    public static String removeDuplicates(String s) {
        if(s.length()==0){
            return null;
        }
        Stack<Character> stack=new Stack();
        int i=0;
        while(i<s.length()) {
            while (i<s.length()&&!stack.isEmpty()&&stack.peek() == s.charAt(i)) {
                stack.pop();
                i++;
            }
            if(i<s.length())
            stack.push(s.charAt(i++));
        }
        char[] chars=new char[stack.size()];
        int initial=0;
        Stack<Character> stack1=new Stack<>();
        while(!stack.isEmpty()){
            stack1.push(stack.pop());

        }
        while (!stack1.isEmpty())
        {
            chars[initial++]=stack1.pop();
        }
return  new String(chars);
    }
}
