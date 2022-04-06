package leetcode;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode new_node = head.next;
            head.next = prev;
            prev = head;
            head = new_node;
        }
        return prev;
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        ListNode head = reverse(one);

        while(head != null){
            System.out.println("head.val = " + head.val);
            head = head.next;
        }
    }
}
