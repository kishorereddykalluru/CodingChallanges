package datastructures.list;

public class EmployeeSinglyLinkedList {

    private EmployeeSLNode head;
    private int size;

    public boolean isEmpty(){
        return head == null;
    }

    public void addElementAtFirst(Employee employee){
        EmployeeSLNode node = new EmployeeSLNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        EmployeeSLNode current = head;
        System.out.print("head -->  " + current);
        while(current != null){
            System.out.print(current+" --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
