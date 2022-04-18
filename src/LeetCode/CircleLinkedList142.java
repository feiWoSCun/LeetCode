package LeetCode;
//这道题好像还可以用哈希表
//##快慢指针
public class CircleLinkedList142 {
}

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3(int x) {
        val = x;
        next = null;
    }
}

class Solution3 {
    public ListNode3 detectCycle(ListNode3 head) {
//定义两个快慢指针
        ListNode3 slow = head;
        ListNode3 fast = head;
        while (fast!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //找到相遇处的时候，定义一个从头开始的辅助节点
                ListNode3 help = head;
                ListNode3 help1=fast;
                while (help1 != help) {
                    help1=help1.next;
                   help=help.next;
                }

            }
        }
        return fast;
    }
}
