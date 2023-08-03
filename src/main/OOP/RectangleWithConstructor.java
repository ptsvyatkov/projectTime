package OOP;

public class RectangleWithConstructor {

    private double length;
    private double width;

    // non-parameterized
    public RectangleWithConstructor() {
        length = 1;
        width = 1;
    }

    // parameterized constructor
    public RectangleWithConstructor(double length, double width){
        this.length = length;
        this.width = width;
    }

    public RectangleWithConstructor(double s){
        this.length = this.width = s; // square
    }

    public static void main(String[] args) {
        RectangleWithConstructor r = new RectangleWithConstructor();
        RectangleWithConstructor r2 = new RectangleWithConstructor(10.0, 5.7);
        RectangleWithConstructor r3 = new RectangleWithConstructor(5.5);
    }

}
