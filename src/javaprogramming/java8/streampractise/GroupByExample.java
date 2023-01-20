package javaprogramming.java8.streampractise;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "apple", "banana", "orange", "pineapple", "banana", "grapes");

        Employee e1 = new Employee(1, "ABC", "Accounting");
        Employee e2 = new Employee(2, "XYZ", "HR");
        Employee e3 = new Employee(3, "DEF", "Finance");
        Employee e4 = new Employee(4, "MNO", "HR");
        Employee e5 = new Employee(5, "PQR", "Developer");

        Map<String, Long> countOfFruits = fruits.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("countOfFruits = " + countOfFruits);

        List<Employee> employees = List.of(e1, e2, e3, e4, e5);
        Map<String, List<Employee>> employeeInDep = employees.stream().collect(
                Collectors.groupingBy(Employee::getDept));

        employeeInDep.forEach((k, v) -> {
            System.out.print(k + " = ");
            System.out.println( v.stream().map(Employee::getName).collect(Collectors.joining(",")));
        });
    }
}
