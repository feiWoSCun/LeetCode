package LeetCode;

import java.util.HashMap;

public class LeetCodeFor454 {
}
class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        //第一次双循环，往表里存东西;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int temp=nums1[i]+nums2[j];
                hashMap.put(temp,hashMap.containsKey(temp)?hashMap.get(temp)+1:1);
            }
        }
        int ans=0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int temp=nums3[i]+nums4[j];
                ans+=hashMap.containsKey(-temp)?hashMap.get(temp):0;
            }

        }
        return ans;
    }
}
