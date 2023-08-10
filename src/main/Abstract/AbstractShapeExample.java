package Abstract;

abstract  class Shape {
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape {

    private double radius;

    public Circle(){
        radius = 10;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle() {
        height = 5;
        width = 10;
    }

    @Override
    double perimeter() {
        return 2*(height+width);
    }

    @Override
    double area() {
        return height*width;
    }
}

public class AbstractShapeExample {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        System.out.println(c.perimeter());
        System.out.println(c.area());
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
