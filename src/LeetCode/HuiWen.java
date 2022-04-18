package LeetCode;

import java.util.Scanner;
public class HuiWen {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            boolean b = false;
            String huiWen = String.valueOf(x);//i转化为字符串
            for (int e = 0; e < huiWen.length(); e++) {
                if (Integer.valueOf(huiWen.substring(e, e + 1), 10) == Integer.valueOf(huiWen.substring
                        (huiWen.length() - e - 1, huiWen.length() - e), 10)) {
                    //判断是否为回文(e+1)+m=length+1,12345
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            return b;
        }
    }
}
