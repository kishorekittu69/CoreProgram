import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    public static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        ListNode first = new ListNode(8);
        obj.head=first;
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(10);
        ListNode fouth = new ListNode(11);
        obj.head.next=second;
        second.next=third;
        third.next=fouth;

        obj.retrieveListNode();
    }

    private void retrieveListNode() {

        ListNode first=head;
        while(first.next!=null)
        {
            System.out.println("Node value: "+first.data);
            first=first.next;
        }
        System.out.println("Node value: "+first.data);
    }
}
