package linkedlist;

public class ReverseLinkedList {

    public static LinkedList.Node reverseLinkedList(LinkedList.Node head) {

        LinkedList.Node prev = null;
        LinkedList.Node current = head;
        LinkedList.Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

       return prev;
    }

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();
        llist.insertNode(10);
        llist.insertNode(20);
        llist.insertNode(30);
        llist.insertNode(40);
        llist.insertNode(50);

        llist.printList();

        llist.head = reverseLinkedList(llist.head);

        llist.printList();

    }
}
