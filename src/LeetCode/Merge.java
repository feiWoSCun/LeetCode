package LeetCode;

public class Merge {
    public static void main(String[] args) {
        int[] s=new int[]{1};
        sortedSquares(s);
        for(int a:sortedSquares(s)){
            System.out.print(a+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        if(nums[0]>=0){
            int[] num=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                num[i]=nums[i]*nums[i];
            }
            return num;
        }
        if(nums[nums.length-1]<=0){
            int[] num=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                num[i]=nums[i]*nums[i];
            }
            int[] helps=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                helps[i]=nums[nums.length-1-i]*nums[nums.length-1-i];
            }
            return helps;
        }
        int part=0;
for(int i=0;i<nums.length;i++) {
    if (nums[i] <0 & nums[i + 1] >= 0) {
        part = i;
        break;
    }
}
int[] left=new int[part+1];
int[] right=new int[nums.length-part-1];
for(int a=0;a<part+1;a++){
    left[a]=nums[part-a]*nums[part-a];
}
int p=0;
for(int b=part+1;b<nums.length;b++){
    right[p++]=nums[b]*nums[b];
}

return  merge(left,right);
    }
    public static int[] merge(int[] a,int [] b){
        int leftPoint=0;
        int rightPoint=0;
        int p=0;
        int[] help=new int[a.length+b.length];
        while(leftPoint<a.length&&rightPoint<b.length) {
            help[p++] = a[leftPoint] >=b[rightPoint] ? b[rightPoint++] : a[leftPoint++];
        }
    while (leftPoint>=a.length&&rightPoint<b.length){
    help[p++]=b[rightPoint++];
    }
        while (leftPoint<a.length&&rightPoint>=b.length){
            help[p++]=a[leftPoint++];
        }
        return help;
    }
}
