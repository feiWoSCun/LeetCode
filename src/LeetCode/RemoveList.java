package LeetCode;

public class RemoveList {
    public static void main(String[] args) {
    }
    class Solution {
        public int removeElement(int[] nums, int val) {
int a=0;
int right=nums.length;
while (a<right){
 if(val==nums[a]){
     nums[a]=nums[right-1];
     right--;
 }
    else
    a++;
}
return right;
        }
    }
}
