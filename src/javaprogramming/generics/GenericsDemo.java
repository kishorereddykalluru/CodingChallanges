package javaprogramming.generics;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add("Kishore");
        stringList.add("Sudhi");

        String kishore = stringList.get(0);
        System.out.println("kishore = " + kishore);
        
    }
}
