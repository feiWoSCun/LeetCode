package LeetCode;

public class DePartTwoSearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target) {
                left = mid+1;
            }
            if (nums[mid] > target) {
                right = mid-1;
            }
            if (nums[mid] == target)
                return mid;
        }
return -1;
    }
}