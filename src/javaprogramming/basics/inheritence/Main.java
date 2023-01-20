package javaprogramming.basics.inheritence;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1();

        Child c = new Child();
        c.m1();

        Parent pc = new Child();
        pc.m1();
    }
}
