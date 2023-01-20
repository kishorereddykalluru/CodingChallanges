package designpatterns.basics;


interface Shape{
    double calculateArea();
}

class Rectangle1 implements Shape{
    private double length;
    private double width;

    public Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
}

class Circle1 implements Shape{
    public double radius;

    public Circle1(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class CalculateArea{
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}

public class OpenClosePrincipleExample {
    public static void main(String[] args) {
        CalculateArea calculateArea = new CalculateArea();
        Shape rectangle = new Rectangle1(10, 20);
        System.out.println(calculateArea.calculateArea(rectangle));
        Shape circle = new Circle1(5);
        System.out.println(calculateArea.calculateArea(circle));
    }
}
