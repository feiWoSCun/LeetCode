package LeetCode;

public class ChildArray {
    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5};

        System.out.println(minSubArrayLen(11,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
            int sum = 0;
            int ans=Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                while(sum>=target){
                    sum-=nums[i];
                    ans=ans>j-i+1?j-i+1:ans;
                    i++;
                }
            }
            return ans==Integer.MAX_VALUE?0:ans;
        }
}
