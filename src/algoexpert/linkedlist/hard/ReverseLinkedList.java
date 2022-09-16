package algoexpert.linkedlist.hard;

import algoexpert.linkedlist.LinkedList;

public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList previousNode = null;
        LinkedList currentNode = head;

        while(currentNode != null) {
            LinkedList nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    public static void main(String[] args) {


    }
}
