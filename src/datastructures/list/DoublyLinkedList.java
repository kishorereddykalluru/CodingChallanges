package datastructures.list;

public class DoublyLinkedList {
    public static void main(String[] args) {

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        Employee danerys = new Employee(1, "Danerys","Targerian");
        Employee john = new Employee(2, "John", "Snow");
        Employee ned = new Employee(3, "Ned", "Stark");
        Employee cersie = new Employee(4, "cersie", "lannister");
        Employee robert = new Employee(5, "Robert", "Baratheon");

        employeeDoublyLinkedList.addElementAtFirst(danerys);
        employeeDoublyLinkedList.addElementAtLast(john);

        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

    }
}
