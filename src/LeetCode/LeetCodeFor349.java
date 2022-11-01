package LeetCode;

import java.util.Collection;
import java.util.HashSet;

public class LeetCodeFor349 {
}

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Collection<Integer> help=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if ((nums1[i] ^ nums2[i1]) == 0) {
                    help.add(nums1[i]);
                    break;
                }
            }
        }
        int[] result = new int[help.size()];
        int a=0;
     for(int j:help){
         result[a++]=j;
     }
     return result;
    }
}
