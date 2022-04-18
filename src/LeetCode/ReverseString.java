package LeetCode;

public class ReverseString {
}
class Solution344 {
    public void reverseString(char[] s) {
        int first=0;
        int last=s.length-1;
        while(true){
            if(first==last)
                break;
            s[first]= (char) (s[first]^s[last]);
            s[last]= (char) (s[first]^s[last]);
            s[first]= (char) (s[first]^s[last]);
            if(first+1==last){
                break;
            }
            first++;
            last--;

        }
    }
}