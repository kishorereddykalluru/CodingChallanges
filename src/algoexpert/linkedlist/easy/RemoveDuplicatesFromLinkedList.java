package algoexpert.linkedlist.easy;

import algoexpert.linkedlist.LinkedList;

public class RemoveDuplicatesFromLinkedList {

    // O(n) time | O(1) space - where n is the number of nodes in the Linked List
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList currentNode = linkedList;

        while(currentNode != null) {
            LinkedList nextDistinctNode = currentNode.next;
            while(nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
                nextDistinctNode = nextDistinctNode.next;
            }

            currentNode.next = nextDistinctNode;
            currentNode = nextDistinctNode;
        }
        return linkedList;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromLinkedList removeDup = new RemoveDuplicatesFromLinkedList();

        LinkedList first = new LinkedList(10);
        LinkedList second = new LinkedList(20);
        LinkedList third = new LinkedList(20);
        LinkedList fourth = new LinkedList(30);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;


        LinkedList afterRemDup = removeDup.removeDuplicatesFromLinkedList(first);

        while(afterRemDup != null) {
            System.out.println(afterRemDup.value);
            afterRemDup = afterRemDup.next;
        }
    }
}
