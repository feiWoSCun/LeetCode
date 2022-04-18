package LeetCode;

public class LinkedListAccord0207 {
}

class ListNode {
    int val;
    ListNode3 next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution2 {
    public ListNode3 getIntersectionNode(ListNode3 headA, ListNode3 headB) {
        int first = 0;
        int second = 0;
        ListNode3 help01 = headA;
        ListNode3 help02 = headB;
        while (help01 == null) {
            help01 = help01.next;
            first++;
        }
        while (help02 == null) {
            help02 = help02.next;
            second++;
        }
        int s = first - second >= 0 ? first - second : second - first;
        if (first >= second) {
            help01 = headA;
            help02 = headB;
            while (s > 0) {
                help01 = help01.next;
                s--;
            }
            while (help01 != null) {
                if (help01 == help02) {
                    return help01;

                }
                help01 = help01.next;
                help02 = help02.next;
                if (help01 == null) {
                    return null;
                }
            }
        }
        if (first < second) {
            help01 = headA;
            help02 = headB;
            while (s > 0) {
                help02 = help02.next;
                s--;
            }
            while (help01 != null) {
                if (help01 == help02) {
                    break;
                }
                help01 = help01.next;
                help02 = help02.next;
                if (help01 == null) {
                    return null;
                }
            }

        }
        return help01;
    }
}
