package linkedlist;

public class PalindromeLinkedList {

    public static boolean isPalindrome(LinkedList.Node head) {
        LinkedList.Node fast_pointer = head;
        LinkedList.Node slow_pointer = head;

        while(fast_pointer.next != null && fast_pointer.next.next != null) {
        fast_pointer = fast_pointer.next.next;
        slow_pointer = slow_pointer.next;
    }

        if(fast_pointer != null) {
        slow_pointer = slow_pointer.next;
    }

        LinkedList.Node second_half = slow_pointer;
    // reverse second half of linked list
    second_half = reverse(second_half);

        return compareLists(head, second_half);


}

    public static LinkedList.Node reverse(LinkedList.Node second_half) {
        LinkedList.Node prev = null;
        LinkedList.Node current = second_half;
        LinkedList.Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static boolean compareLists(LinkedList.Node head, LinkedList.Node second_half) {
        while(second_half != null) {
            if(head.data != second_half.data) {
                return false;
            }
            second_half = second_half.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();
        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(2);
        llist.insertNode(1);

        llist.printList();

        System.out.println(isPalindrome(llist.head));

        llist.printList();
    }


}
