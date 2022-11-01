package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeFor933 {

}
class RecentCounter {

    int left;
    int right;
    List<Integer> timeList;
    public RecentCounter() {
        left = 0;
        right = 0;
        timeList = new ArrayList<>();
    }

    public int ping(int t) {
        timeList.add(t);
        right++;
        t = t - 3000;
        while(t>timeList.get(left)){
            left++;
        }
        return right -left;
    }
}