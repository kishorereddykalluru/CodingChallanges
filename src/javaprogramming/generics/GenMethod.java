package javaprogramming.generics;

public class GenMethod {

    /**
     * takes input element and print element class and value of element
     * @param element
     * @param <T>
     */
    public static <T> void genericsDisplay(T element){
        System.out.println("element.getClass().getName() = " + element.getClass().getName());
        System.out.println("element = " + element);
    }
}
