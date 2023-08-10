package Inheritance;

class Car {
    public void start()      { System.out.println("Car started.");}
    public void accelerate() { System.out.println("Car accelerated.");}
    public void changeGear() { System.out.println("Car gear changed.");}
}

class LuxuryCar extends Car{
    @Override
    public void changeGear() { System.out.println("Luxury Car gear automatic.");}
    public void openRoof()   { System.out.println("Luxury Car roof opened.");}
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        /* Car c = new Car();
        c.start(); c.changeGear(); c.accelerate(); */

        Car car = new LuxuryCar();
        car.start();
        car.accelerate();
        ((LuxuryCar) car).openRoof(); // typecasting
        car.changeGear(); // overridden
    }
}
