package LeetCode;
//203,移除链表元素
//这个递归真的太秀了！
public class DeleteElements {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head==null){
                return head;
            }
            head.next=removeElements(head.next,val);
            return head.val==val?head.next:head;
        }
    }
}
