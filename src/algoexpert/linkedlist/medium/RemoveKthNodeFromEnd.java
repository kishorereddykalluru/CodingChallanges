package algoexpert.linkedlist.medium;

import algoexpert.linkedlist.LinkedList;
import algoexpert.linkedlist.LinkedListUtil;

public class RemoveKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int counter = 1;
        LinkedList first = head;
        LinkedList second = head;

        while(counter <= k) {
            second = second.next;
            counter++;
        }

        if(second == null) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        while(second.next != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
     }

    public static void main(String[] args) {

        LinkedListUtil llu = new LinkedListUtil();

        llu.insert(0);
        llu.insert(1);
        llu.insert(2);
        llu.insert(3);
        llu.insert(4);
        llu.insert(5);
        llu.insert(6);
        llu.insert(7);
        llu.insert(8);
        llu.insert(9);

        llu.display();


    }
}
