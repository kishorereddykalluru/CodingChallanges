package designpatterns.basics;


class RealPrinter{
    // the "delegate"
    void print(){
        System.out.println("The Delegate");
    }

}

class Printer {
    RealPrinter p = new RealPrinter();
    // the "delegator"
    void print(){
        p.print();
    }
}

public class DelegateExample {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.print();
    }
}
