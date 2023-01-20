package designpatterns.basics;

public class OpenClosePrincipleBadDesign {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 10;
        rec.width = 20;
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateRectangleArea(rec));
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println(areaCalculator.calculateCircleArea(circle));
    }

}

//Rectangle class
class Rectangle{
    public double length;
    public double width;
}

// 1. implemented rectangle calculator initially
//in future there is circle to be added then we need to change AreaCalculator class
class AreaCalculator{
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle){
        return Math.PI * circle.radius * circle.radius;
    }
}

class Circle{
    public double radius;
}
