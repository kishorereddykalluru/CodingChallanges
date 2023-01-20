package datastructures.list;

public class SinglyLinkedList {

    public static void main(String[] args) {

        EmployeeSinglyLinkedList singlyLinkedListEmployee = new EmployeeSinglyLinkedList();

        Employee danerys = new Employee(1, "Danerys","Targerian");
        Employee john = new Employee(2, "John", "Snow");
        Employee ned = new Employee(3, "Ned", "Stark");
        Employee cersie = new Employee(4, "cersie", "lannister");

        System.out.println(singlyLinkedListEmployee.isEmpty());

        singlyLinkedListEmployee.addElementAtFirst(danerys);
        singlyLinkedListEmployee.addElementAtFirst(john);
        singlyLinkedListEmployee.addElementAtFirst(ned);
        singlyLinkedListEmployee.addElementAtFirst(cersie);

        System.out.println(singlyLinkedListEmployee.getSize());
        System.out.println(singlyLinkedListEmployee.isEmpty());

        singlyLinkedListEmployee.printList();


    }
}
