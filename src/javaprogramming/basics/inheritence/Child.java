package javaprogramming.basics.inheritence;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent{

    @Override
     public void m1() throws RuntimeException {
        System.out.println("m1 method from child class");
    }
}
