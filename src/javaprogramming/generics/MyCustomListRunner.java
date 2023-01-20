package javaprogramming.generics;

public class MyCustomListRunner {

    static <T> T anyType(T val) {
        return val;
    }

    public static void main(String[] args) {

        MyCustomList<String> list1 = new MyCustomList<>();

        list1.addElement("Element1");
        list1.addElement("Element2");
        var value = list1.getElement(0);
        System.out.println("value = " + value);
        System.out.println("list1 = " + list1);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(10));
        var number = list2.getElement(1);
        System.out.println("number = " + number);
        System.out.println("list2 = " + list2);

        String kishore = anyType("Kishore");
        Integer integer = anyType(20);
        Boolean aBoolean = anyType(true);

        System.out.println("kishore = " + kishore);
        System.out.println("integer = " + integer);
        System.out.println("aBoolean = " + aBoolean);

    }
}
