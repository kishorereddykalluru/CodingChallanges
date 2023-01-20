package javaprogramming.annotations;

public class Hello {
    @CustomAnnotation
    public void m1(){
        System.out.println("inside m1 method");
    }

    @CustomAnnotation(value = 10)
    public void m2(){
        System.out.println("Inside m2");
    }
}
