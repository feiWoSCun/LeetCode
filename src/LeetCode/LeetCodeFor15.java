package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeFor15 {
    public static void main(String[] args) {
        int[] i={};
        Solution15.threeSum(i);
    }
}
class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length==0) return list;
        Process(nums,0,nums.length-1);
       Set<Integer> map=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                map.add(nums[i]+nums[j]);
                for (int l = j+1; l < nums.length; l++) {
                    List<Integer> inner = new ArrayList<>();
                    if (map.contains(-nums[l])&&nums[i]+nums[j]+nums[l]==0) {
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[l]);
                        list.add(inner);
                        break;
                    }
                    while (l<=nums.length-2&&nums[l]==nums[l+1]) l+=1;}
                while (j<=nums.length-2&&nums[j]==nums[j+1]) j+=1;}
            while (i<=nums.length-2&&nums[i]==nums[i+1]) i+=1;}
        return list;
    }
    public static void Process(int[] arr, int L, int R) {
        if (L == R) return;
        int mid = L + ((R - L)>> 1);
        Process(arr, L, mid);
        Process(arr, mid + 1, R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) help[i++] = arr[p1++];
        while (p2 <= R) help[i++] = arr[p2++];
        for (i = 0; i < help.length; i++) {arr[L + i] = help[i];
        }
    }
    }