package datastructures.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DatastructureList {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        List<Employee> linkedList = new LinkedList<>();

        linkedList.add(new Employee(5, "linked", "list"));

        employeeList.add(new Employee(1, "Danerys","Targerian"));
        employeeList.add(new Employee(2, "John", "Snow"));
        employeeList.add(new Employee(3, "Ned", "Stark"));
        employeeList.add(new Employee(4, "cersie", "lannister"));


        employeeList.forEach(System.out::println);


    }
}
