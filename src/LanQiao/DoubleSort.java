package LanQiao;
//
import java.util.Scanner;

public class DoubleSort {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //n是长度
        int n = sca.nextInt();
        //m是操作次数
        int m = sca.nextInt();
        int[] helps=new int[n];
        //确定数组
        for(int a=0;a<n;a++){
            int b=a;
            helps[a]=++b;
        }
        for(int first=0;first<m;first++){
            int bool=sca.nextInt();
            int qi=sca.nextInt();
            if(bool==0){
                DownProcess(helps,0,qi-1);
            }
            if(bool==1){
                UpProcess(helps,qi-1, helps.length-1);
            }
        }
       for(int a:helps){
           System.out.print(a+" ");
       }
    }
    //降序
    public static void DownProcess(int[] arr, int L, int R) {
        if (L == R)
            return;
        int mid = L + ((R - L)>> 1);
        DownProcess(arr, L, mid);
        DownProcess(arr, mid + 1, R);
        merge1(arr,L,mid,R);
    }
    //升序
    public static void UpProcess(int[] arr, int L, int R) {
        if (L == R)
            return;
        int mid = L + ((R - L)>> 1);
        UpProcess(arr, L, mid);
        UpProcess(arr, mid + 1, R);
        merge(arr,L,mid,R);
    }
    //升序
    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M)
            help[i++] = arr[p1++];
        while (p2 <= R)
            help[i++] = arr[p2++];
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
    //降序
    public static void merge1(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1]>= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M)
            help[i++] = arr[p1++];
        while (p2 <= R)
            help[i++] = arr[p2++];
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}
