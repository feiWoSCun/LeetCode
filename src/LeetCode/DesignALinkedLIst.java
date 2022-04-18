package LeetCode;

public class DesignALinkedLIst {
    /* Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     *
     */
   // ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex",
    // "deleteAtIndex","get","deleteAtIndex","get"]
     //       [[],[1],[3],[1,2],[1],[1],[1],[3],[3],[0],[0],[0],[0]]
    public static void main(String[] args) {
     MyLinkedList my = new MyLinkedList();
 /*      my.addAtHead(1);
       my.addAtTail(3);
       my.addAtIndex(1,2);
       my.get(1);
       my.deleteAtIndex(1);
       my.get(1);
       my.get(3);
       my.deleteAtIndex(3);
       my.deleteAtIndex(0);
       my.get(0);
       my.deleteAtIndex(0);
       my.get(0);*/
       // my.addAtHead(1);
       //my.addAtIndex(0,2);
      // my.addAtHead(2);
        //my.deleteAtIndex(0);
        //my.deleteAtIndex(0);
    /*    my.addAtIndex(1,0);
        System.out.println( my.get(0));*/
      /*  my.addAtHead(1);
        my.addAtTail(1);
        my.addAtTail(1);*/
        // System.out.println(my.first.next.pre);
       /* System.out.println(my.first.obj);
        System.out.println(my.first.next.obj);*/
    /*    my.addAtIndex(0, 10);
        //System.out.println(my.first.obj);
        my.addAtIndex(1, 20);
        my.addAtIndex(2, 30);
        my.addAtIndex(3,40);
      my.deleteAtIndex(3);*/
       // System.out.println(my.first.next.pre.obj);
      /*  MyLinkedList.Node node=my.first.next;
        System.out.println(node.next.obj);
        System.out.println(node.pre.obj);
        System.out.println(node.pre.next.obj);
        System.out.println(node.next.pre.obj);*/
      /*  MyLinkedList.Node node = my.first;*/
     /*  while (node != null) {
            System.out.println(node.obj);
            node = node.next;
           //System.out.println(node.pre.obj);
        }*/
        my.addAtIndex(0,1);my.addAtIndex(1,3);
    }
}

//testcase has incorrect number of arguments (expected 2, got 1)
class MyLinkedList {
    Node first;
    Node last;

    public MyLinkedList() {
    }
    public int get(int index) {
        Node node = first;
        if(node==null){
            return -1;
        }
        while (index-- != 0) {
            node = node.next;
            if (node == null)
                return -1;
        }
        return node.obj;
    }

    public void addAtHead(int val) {
        if (first == null) {
            first = new Node(val, null, null);
        }
       else {
           Node node=first;
           first=new Node(val,null,node);
           node.pre=first;
        }
       //找到最后一个node
       Node help=first;
       while(help.next!=null){
           help=help.next;
       }
       last=help;
    }

    public void addAtTail(int val) {
        if(first==null) {
            first=new Node(val,null,null);
            return;
        }
        Node node=first;
        while(node.obj!=val) {
            Node help=node;
            node = node.next;
            if (node == null) {
               node=new Node(val,help,null);
               Node node1=first;
               while(node1.next!=null){
                   node1=node1.next;
               }
               node1.next=node;
               last=node;
               return;
        }
        }
        //如果找到了
        last.next=new Node(val,last,null);
       last=last.next;
       return;
    }

    public void addAtIndex(int index, int val) {
        Node node = first;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(first==null&&index!=0){
            return;
        }
        while (index-- >0) {
            node = node.next;
            if (node == null) {
                Node node3=last;
               node=new Node(val,node3,null);
               node3.next=node;
               last=node;
               return;
            }
        }
       Node node1=new Node(val,node.pre,node);
        node.pre.next=node1;
        node.pre=node1;
    }

    public void deleteAtIndex(int index) {
        Node node = first;
        while (index-- >0) {
            node = node.next;
            if (node == null)
                return;
        }
        if(node==last){
            if(last.pre==null){
                last=first=null;
                return;
            }
            last=last.pre;
            last.next=null;
            return;
        }
        if(node.pre==null){
            first=first.next;
            first.pre=null;
             return;
        }
        node.pre.next = node.next;
        node.next.pre=node.pre;
    }

    class Node {
        int obj;
        Node pre;
        Node next;

        public Node(int obj, Node pre, Node next) {
            this.obj = obj;
            this.pre = pre;
            this.next = next;
        }
    }
}
