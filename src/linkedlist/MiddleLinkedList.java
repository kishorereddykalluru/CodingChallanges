package linkedlist;

public class MiddleLinkedList {

    public static LinkedList.Node isMiddle(LinkedList.Node head) {

        LinkedList.Node fast_pointer = head;
        LinkedList.Node slow_pointer = head;

        while(fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }


        return slow_pointer;
    }


    public static void main(String[] args) {

        LinkedList llist = new LinkedList();
        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(3);
        llist.insertNode(4);
        llist.insertNode(5);
        llist.insertNode(6);
        llist.printList();

        llist.head = isMiddle(llist.head);

        llist.printList();
    }
}
