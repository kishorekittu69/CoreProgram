import java.util.LinkedList;
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


        obj.inserNodeAtBegin();

        obj.findTheLenght();
        obj.insetNodeAtEnd();
        obj.InsertGivenPosition(2);
        obj.retrieveListNode();

    }

    private void InsertGivenPosition(int position) {

        ListNode newNode=new ListNode(28);
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=1;
        ListNode previous=head;
        while(count<position-1)
        {
            previous=previous.next;
            count++;
        }
        ListNode current=previous.next;
        previous.next=newNode;
        newNode.next=current;
    }

    private void insetNodeAtEnd() {

        ListNode last = new ListNode(16);
        if(head==null)
        {
            head=last;
            return;
        }

        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=last;



    }

    private void inserNodeAtBegin() {

        // Insert node at the begining of the singly linked list.

        ListNode newNode=new ListNode(15);
        newNode.next=head;
        head=newNode;
    }

    private void findTheLenght() {
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        System.out.println("Lenght of singly linked list: "+count);
    }

    private void retrieveListNode() {

        ListNode first=head;
        while(first!=null)
        {
            System.out.println("Node value: "+first.data);
            first=first.next;
        }

    }
}
