package MethodsPracc;

class RectangleImpl {
    public double length;
    public double width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

    @Override
    public String toString() {
        return "RectangleImpl{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

public class Rectangle {
    public static void main(String[] args) {
        RectangleImpl rectangle = new RectangleImpl();
        rectangle.length = 5;
        rectangle.width = 5;
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.isSquare());
        System.out.println(rectangle.area());
        System.out.println(rectangle);
    }
}