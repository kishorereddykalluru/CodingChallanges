package dummy;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Set<Pairs> pairs = new HashSet<>();

        boolean pair1 = pairs.add(new Pairs(10, 20));
        boolean pair2 = pairs.add(new Pairs(10, 20));
        boolean part3 = pairs.add(new Pairs(20, 10));

        System.out.println("pair1 = " + pair1);
        System.out.println("pair2 = " + pair2);
        System.out.println("part3 = " + part3);
        pairs.forEach(p -> System.out.println(p.getNum1() + "  "+p.getNum2()));
    }
}
