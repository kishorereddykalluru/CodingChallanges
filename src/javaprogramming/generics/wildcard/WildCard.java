package javaprogramming.generics.wildcard;

import java.util.ArrayList;

public class WildCard {

    public void m1(ArrayList<String> s) {
        //with in this method we can add only String types
        //s.add("Kishore"); -- valid
        //s.add(10); -- invalid
    }
      public void m2(ArrayList<?> l) {
          // with in the method we cannot add any type but null
          // this is suitable for read only operations
          //l.add(10.5); -- invalid
          //l.add("A"); -- invalid
          //l.add(null); -- valid
          l.forEach(System.out::println);
      }

      public void m3(ArrayList<? super Integer> i) {
        //i.add(10.5);
        i.add(10);
      }

    public static void main(String[] args) {
            WildCard w = new WildCard();
            ArrayList<?> l = new ArrayList<String>();

    }
}
