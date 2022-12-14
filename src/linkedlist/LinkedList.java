package linkedlist;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertNode(int data) {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }
}
