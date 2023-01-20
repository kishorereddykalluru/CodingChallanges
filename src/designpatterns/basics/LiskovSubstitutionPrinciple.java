package designpatterns.basics;

abstract class Vehicle{
    abstract int speed();
    abstract int wheels();
}

class Bike extends Vehicle{

    @Override
    int speed() {
        System.out.println("speed of bike is");
        return 50;
    }

    @Override
    int wheels() {
        return 2;
    }

    void vehicleModel(){
        System.out.println("two wheeler");
    }
}

class Car extends Vehicle{

    @Override
    int speed() {
        System.out.println("speed of car is");
        return 70;
    }

    @Override
    int wheels() {
        return 4;
    }

    void wearSeatBelt(){
        System.out.println("Please wear seat belt for safer drive");
    }
}

class Bus extends Vehicle{

    @Override
    int speed() {
        System.out.println("speed of bus is");
        return 30;
    }

    @Override
    int wheels() {
        return 4;
    }

    void noOfPassengers(){
        System.out.println("Bus can accommodate 30 passengers");
    }
}

public class LiskovSubstitutionPrinciple {


    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.speed();
        vehicle.wheels();

        Vehicle car = new Car();
        car.speed();
        car.wheels();
        //car.wearSeatBelt();

        vehicle = new Bus();
        vehicle.speed();
        vehicle.wheels();
    }
}
