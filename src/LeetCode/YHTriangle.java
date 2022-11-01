package LeetCode;

import java.util.Scanner;

public class YHTriangle {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int test=sca.nextInt();
        //n为三角形排数
        long[][] arr = new long [1000][];
        //开辟数组大小
        for (int a = 1; a <= 1000; a++) {
            arr[a - 1] = new long[a];
            arr[a - 1][a - 1] = arr[a - 1][0] = 1;
        }
        for (int tri = 3; tri <= 1000; tri++) {
            for (int begin = 1; begin < arr[tri - 1].length - 1; begin++) {
                arr[tri - 1][begin] = arr[tri - 2][begin - 1] + arr[tri - 2][begin];
            }
        }
        for(int i=0;i< arr.length;i++){
            for (int ii=0;ii<arr[i].length;ii++){
                if(test==arr[i][ii]){
                    System.out.print((1+i)*i>>1+ii+1);
                    System.exit(0);
                }
            }
        }
    }
}



