package LeetCode;

public class DeleteNode19{
    public static void main(String[] args) {
        ListNode two=new ListNode(2,null);
        ListNode one=new ListNode(1,two);
        removeNthFromEnd(one,2);

}
 static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list = new ListNode(0, head);
        ListNode first=list;
        ListNode second = head;
        if (head.next == null) {
            return null;
        }
        for (int i = 0; i < n - 1; i++) {
            second = second.next;
        }
        while (second.next != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
        return list.next;
    }
}
