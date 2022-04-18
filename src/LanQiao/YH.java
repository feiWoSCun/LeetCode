package LanQiao;
import java.util.ArrayList;
import java.util.Scanner;
public class YH {
        public static void main(String[] args) {
            Scanner sca = new Scanner(System.in);
            long n=sca.nextLong();
            if (n!=1){
                for(int a=1;a<=1000000000;a++){
                    for(int b=1;b<=a>>1;b++){
                       long[] arr=new long[b];
                       long[] array=new long[b];
                       int s=a,m=b;
                        while(m>=1){
                          arr[m-1]=--s;
                          array[m-1]=m--;
                        }
                      //对数组进行判断和精简
                       long answer=YH.YueFen(arr,array);
                        if(answer==n) {
                            System.out.println(((a*a-a) >> 1) + b + 1);
                            System.exit(0);
                        }
                    }
                }
            }
            if(n==1)
                System.out.println(1);
        }
    public  static long YueFen(long[] a,long[] b ){
           long  help=1;
            long hep=1;
            for(int begin=0;begin<a.length;begin++){
             for(int start=0;start<b.length;start++) {
                 if (b[start] != 1&&b[start]!=0) {
                     if (a[begin] % b[start] == 0) {
                         a[begin] = a[begin] / b[start];
                         b[start] = 1;
                     }
                 }
             }
            }
            for(int first=0;first<a.length;first++){
                help*=a[first];
            }
        for(int first=0;first<b.length;first++){
            hep*=b[first];
        }
        return help/hep;
    }
}
