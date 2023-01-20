package javaprogramming.generics;

public class Main {
    
    public static void main(String...args){
//        Test<Integer> i = new Test(10);
//        System.out.println("i.getObj() = " + i.getObj());
//
//        Test<String> s = new Test("Kishore");
//        System.out.println("s.getObj() = " + s.getObj());

        Test<Integer> t = new Test(10);


        GenMethod.genericsDisplay("Kishore");
        GenMethod.genericsDisplay(10);
        GenMethod.genericsDisplay(12.00);
    }
}
