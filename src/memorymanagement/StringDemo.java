package memorymanagement;

public class StringDemo {

    public static void main(String[] args) {

        String one = "hello";
        String two = "hello";

        String three = new String("hello");
        String four = new String("hello");

        System.out.println(one.hashCode() + " --- " + two.hashCode());
        System.out.println(three.hashCode() + " --- " + four.hashCode());
        System.out.println("== operator: "+(one == two));
        System.out.println("== operator " + (three == four));
        System.out.println("equals operator " + (one.equals(two)));
        System.out.println("equals operator " + (three.equals(four)));

        System.out.println("== operator: "+(one == three));
        System.out.println("equals operator " + (one.equals(three)));

    }
}
