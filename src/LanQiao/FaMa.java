package LanQiao;

import java.util.*;

public class FaMa {
    final static int weight = 200005;
    final static int a = 100000;//偏移量，数组下标不能<0;
    static int sum = 0;//所有体积总和
    static boolean[][] dp = new boolean[105][weight];

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int N = sca.nextInt();
        int w[] = new int[N + 1];
//求出sum
        for (int a = 1; a <= N; a++) {
            w[a] = sca.nextInt();
            sum += w[a];
        }
        dp[0][a] = true;
        for (int num = 1; num <= N; num++) {
            for (int b = -sum; b <= sum; b++) {
                dp[num][b + a] = dp[num - 1][b + a];
                if (b + w[num] <= sum)
                    dp[num][b + a] |= dp[num - 1][b + a + w[num]];
                if (b - w[num] >= -sum)
                    dp[num][b + a] |= dp[num - 1][b + a - w[num]];
            }
        }
        int ans = 0;
        for (int j = 1; j <= sum; j++) {
            if (dp[N][j + a]) {
                ans++;
            }
        }
        System.out.println(ans);


    }
}
