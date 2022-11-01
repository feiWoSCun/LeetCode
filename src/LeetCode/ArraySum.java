package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ArraySum {
//2022.2.14
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
       twoSum(nums,7);
}

/*class Solutionlalala {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int a=0;a<nums.length;a++){

            for(int next=a+1;next<nums.length;next++){
                if((nums[a] + nums[next]) == target) {
                    result[0] = a;
                    result[1] = next;
                    break;
                }
            }
        }
       // System.out.println(result[0]+""+result[1]);
        return result;
    }
}*/
//还可以参考哈希表
        public static int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            if(nums == null || nums.length == 0)
                return res;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int temp = target - nums[i];
                if(map.containsKey(temp)){
                    res[1] = i;
                    res[0] = map.get(temp);
                }
                map.put(nums[i], i);
            }
            return res;
        }
}
