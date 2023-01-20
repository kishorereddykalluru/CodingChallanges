package datastructures.list;

public class ReverseLinkedListWithRecursion {

    static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        public Node head;

        public LinkedList(){
            this.head = null;
        }

        public void insertNode(int nodeData){
            Node node = new Node(nodeData);

            if(this.head != null){
                node.next = head;
            }
            this.head = node;
        }
    }

    public static void printSinglyLinkedList(Node node, String sep){
        while(node != null){
            System.out.print(String.valueOf(node.data) + sep);
            node = node.next;
        }
    }

    static Node reverse(Node head){
        if(head == null)
            return head;

        if(head.next == null)
            return head;

        Node newHeadNode = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHeadNode;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.insertNode(20);
        llist.insertNode(4);
        llist.insertNode(15);
        llist.insertNode(85);

        System.out.println("Given linked list:");
        printSinglyLinkedList(llist.head, " ");

        System.out.println();
        System.out.println("Reversed Linked list:");
        Node llist1 = reverse(llist.head);
        printSinglyLinkedList(llist1, " ");

    }

}
