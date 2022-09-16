package algoexpert.linkedlist.hard;

import algoexpert.linkedlist.LinkedList;

public class FindLoopInLinkedList {

    public static LinkedList findLoop(LinkedList head) {
        LinkedList first = head.next;
        LinkedList second = head.next.next;

        while(first != second) {
            first = first.next;
            second = second.next;
        }

        first = head;
        while(first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public static void main(String[] args) {


    }
}
