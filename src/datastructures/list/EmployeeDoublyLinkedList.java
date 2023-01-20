package datastructures.list;

public class EmployeeDoublyLinkedList {

    private EmployeeDLNode head;
    private EmployeeDLNode tail;
    private int size;

    public boolean isEmpty(){
        return head == null;
    }


    public void addElementAtFirst(Employee employee){
        EmployeeDLNode node = new EmployeeDLNode(employee);
        node.setNext(head);
        if(head == null) {
            head = tail = node;
        } else {
            head.setPrevious(node);
            head = node;
        }
        size++;
    }

    public void addElementAtLast(Employee employee){
        EmployeeDLNode node = new EmployeeDLNode(employee);
        if(tail == null){
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }

        size++;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        EmployeeDLNode current = head;
        System.out.print("head ->  " + current);
        while(current != null){
                if(current.getNext() == null){
                    System.out.print(current+" -> ");
                    current = current.getNext();
                } else {
                    System.out.print(current+" <=> ");
                    current = current.getNext();
                }
        }
        System.out.println("null");
    }



}
