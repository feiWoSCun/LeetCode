package LanQiao;
import java.util.Scanner;
import static java.lang.Math.abs;
public class HDYFaMa {
        public static void main(String[]args){
            Scanner SC=new Scanner(System.in);
            int n=SC.nextInt();
            int sum=0;
            int a[]=new int[n];
            for(int i=0;i<=n-1;i++){
                a[i]=SC.nextInt() ;
                sum+=a[i];
            }
            boolean[][]dp=new boolean [105][200001];
            for(int i=0;i<=n-1;i++){
                for(int j=1;j<=sum;j++){
                    if(i==0){
                        if(a[i]==j)
                            dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                        if(!dp[i][j]) {
                            if (a[i] == j)
                                dp[i][j] = true;
                            if (dp[i][j + a[i]])
                                dp[i][j] = true;
                            if (dp[i][abs(j - a[i])])
                                dp[i][j] = true;
                        }
                    }
                }
            }
            int end=0;
            for (int j=1;j<=sum;j++){
                if(dp[n-1][j])
                    end++;
            }
            System.out.println(end);

        }
    }

