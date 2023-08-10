package Inheritance;

class Circle { // superclass

    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public double area() {
        return 1;
    }

    public double perimeter() {
        return 2;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        c1.perimeter();
        Cylinder cyl1 = new Cylinder();
        cyl1.area();
        cyl1.perimeter();
        cyl1.volume();
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 0.0;
    }

    public double volume(){
        return 3.0;
    }
}
