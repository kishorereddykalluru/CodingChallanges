package javaprogramming.generics;

import java.util.ArrayList;

public class MyCustomList<E> {

    ArrayList<E> list = new ArrayList<>();

    public void addElement(E element) {
        list.add(element);
    }

    public void removeElement(E element) {
        list.remove(element);
    }

    public E getElement(int index) {
        return list.get(index);
    }

    public String toString() {
        return list.toString();
    }

}
