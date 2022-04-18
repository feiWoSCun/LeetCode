package LeetCode;

public class TurnAlinkedList24 {
}
class Solution {
    public ListNode24 swapPairs(ListNode24 head) {
        if(head==null){
            return head;
        }
ListNode24  Next=head.next;
Next.next=head;
head.next=swapPairs(Next.next);
return Next;
    }
}
class ListNode24 {
    int val;
    ListNode24 next;
    ListNode24() {}
    ListNode24(int val) { this.val = val; }
    ListNode24(int val, ListNode24 next) { this.val = val; this.next = next; }
}
