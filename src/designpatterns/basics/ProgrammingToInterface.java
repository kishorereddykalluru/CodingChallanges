package designpatterns.basics;

interface Display{
    void display();

}

class Monitor implements Display{
    public void display(){
        System.out.println("com.designpatterns.basics.Display through com.designpatterns.basics.Monitor");
    }
}

class Projector implements Display{
    public void display(){
        System.out.println("com.designpatterns.basics.Display through com.designpatterns.basics.Projector");
    }
}

class Computer {

    public void getDisplay(Display display) {
        display.display();
    }
}

public class ProgrammingToInterface {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Display monitor = new Monitor();
        computer.getDisplay(monitor);
        Display projector = new Projector();
        computer.getDisplay(projector);
    }
}
