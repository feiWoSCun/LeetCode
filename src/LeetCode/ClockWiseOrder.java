package LeetCode;
//LeEtCode上面的螺旋矩阵
//顺时针打印数组
public class ClockWiseOrder {
    public static void main(String[] args) {
        generateMatrix(5);
    }
    public  static int[][] generateMatrix(int n) {
        int[][] target = new int[n][n];
        int on = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        int a = 0;
        if(n%2==1)
            target[n/2][n/2]=n*n;
        while (n > 0) {
            //上面遍历
            for (int i = a; i <= n - 2; i++) {
                target[on][i] = count++;
            }
            on++;
            for (int i = a; i <= n - 2; i++) {
                target[i][right] = count++;
            }
            right--;
            a++;
            for (int i = n - 1; i >= a; i--) {
                target[bottom][i] = count++;
            }
            bottom--;
            for (int i = n - 1; i >= a; i--) {
                target[i][left] = count++;
            }
            left++;
            n--;
        }
        return target;
    }
}
