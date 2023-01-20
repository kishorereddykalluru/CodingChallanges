package javaprogramming.java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String[] str = new String[10];
        Optional<String> fifthElement = Optional.ofNullable(str[5]);
        if(fifthElement.isPresent()){
            String element = str[5].toLowerCase();
            System.out.println("element = " + element);
        } else {
            System.out.println("Word is null");
        }

    }
}
