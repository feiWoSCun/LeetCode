package LeetCode;

public class TurnALinkedList {
}

/*class ListNode {
    int val;
    ListNode24 next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode24 next) {
        this.val = val;
        this.next = next;
    }
}*/

class Solution1 {
    public ListNode24 reverseList(ListNode24 head) {
        ListNode24 Next ;
        ListNode24 pre = null;
        while (head!= null) {
           Next=head.next;
           head.next=pre;
           pre=head;
           head=Next;
        }
        return pre;
    }
}
