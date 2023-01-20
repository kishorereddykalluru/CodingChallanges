package javaprogramming.staticexample;

public class StaticExample {

    static{
        System.out.println("static block");
    }

    public StaticExample(){
        System.out.println("Constructor in static example");
    }

    {
        System.out.println("Inside instance block");
    }

    public void m1(){
        System.out.println("Inside m1 method");
    }

}
