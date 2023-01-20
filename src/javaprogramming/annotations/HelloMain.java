package javaprogramming.annotations;

import java.lang.reflect.Method;

public class HelloMain {

    public static void main(String...args) throws NoSuchMethodException {

        Hello h = new Hello();

        Method m1 = h.getClass().getMethod("m1");
        Method m2 = h.getClass().getMethod("m2");

        CustomAnnotation c = m1.getAnnotation(CustomAnnotation.class);
        CustomAnnotation c1 = m2.getAnnotation(CustomAnnotation.class);

        System.out.println("c.value() = " + c.value());
        System.out.println("c1.value() = " + c1.value());

    }
}
