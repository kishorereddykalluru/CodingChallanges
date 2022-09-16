package algoexpert.linkedlist;

public class LinkedListUtil {

    LinkedList head;

    public void insert(int data) {
        LinkedList newNode = new LinkedList(data);

        if(head == null) {
            head = newNode;
            return;
        }

        LinkedList temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void display() {
        LinkedList current = head;

        while(current != null) {
            System.out.print(current.value+ " -> ");
            current = current.next;
        }

        System.out.print("null");
    }
}
