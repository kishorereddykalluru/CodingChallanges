package javaprogramming.java8.streampractise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxInAList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 3, 6, 9, 7, 8);

        Optional<Integer> sum = list.stream().filter(x -> !(x % 2 == 0))
                .map(i -> i * i).reduce(Integer::sum);
        sum.ifPresent(System.out::println);

        int max1 = list.stream().reduce(Integer::max).get();
        System.out.println("max1 = " + max1);

        int max2 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max2 = " + max2);

        int max3 = list.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println("max3 = " + max3);

        Employee e1 = new Employee(1, "ABC", "Accounting");
        Employee e2 = new Employee(2, "XYZ", "HR");
        Employee e3 = new Employee(3, "DEF", "Finance");
        Employee e4 = new Employee(4, "MNO", "HR");
        Employee e5 = new Employee(5, "PQR", "Developer");
        Employee e6 = new Employee(2, "PQR", "Developer");

        List<Employee> e11 = List.of(e1, e2, e3, e4, e5, e6);
        List<Employee> collect = e11.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
