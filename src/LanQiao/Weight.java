package LanQiao;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //n是长度
        int n = sca.nextInt();
        //m是操作次数
        int m = sca.nextInt();
        int[] help=new int[n];
        //确定数组
        for(int a=0;a<n;a++){
            int b=a;
            help[a]=++b;
        }
       for(int first=0;first<m;first++){
            int bool=sca.nextInt();
            int qi=sca.nextInt();
            sort(bool,qi,help);
        }
        for(int a=0;a<help.length;a++){
            System.out.print(help[a]+" ");
        }
    }
    private static int[] sort(int bool, int qi, int[] help) {
        if (bool == 0) {
            downSort(0, qi - 1, help);
        } else {
            upSort(qi - 1, help.length - 1, help);
        }
    return help;
    }
    private static int[] downSort(int first,int end,int[] help){
        for(int a=first;a<end;a++){
            for(int b=first;b<end-a;b++){
                if(help[b]<help[b+1]){
                    help[b]=help[b]^help[b+1];
                    help[b+1]=help[b]^help[b+1];
                    help[b]=help[b]^help[b+1];
                }
            }

        }
        return help;
    }
    private static int[] upSort(int first,int end,int[] help){
        int s=0;
        for(int a=first;a<end;a++){
            for(int b=first;b<end-s;b++){
                if(help[b]>help[b+1]){
                    help[b]=help[b]^help[b+1];
                    help[b+1]=help[b]^help[b+1];
                    help[b]=help[b]^help[b+1];
                }
            }
            s++;
        }
        return help;
    }
}
