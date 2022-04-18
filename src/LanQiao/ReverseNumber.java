package LanQiao;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(1>>1);
    }
}
class Solution {
    public int reverse(int x) {
       long ans = 0;//他的要求是不能超过32位;你用的是超过32位之后的返回值 ;没有益处的情况下做出判断
        int i = 0;
        while (x != 0) {
            i = x % 10;
            if ((ans > Integer.MAX_VALUE/10 )|| ans ==Integer.MIN_VALUE&&i>7)
                return 0;
            if ((ans < Integer.MIN_VALUE/10 )|| ans ==Integer.MIN_VALUE&&i<-8)
                return 0;

            ans = (ans) * 10 + i;//最后一步，差了10倍
            x /= 10;

        }
        return (int) ans;
    }
}
