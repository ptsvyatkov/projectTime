package OOP;

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(){
        this.radius = 1;
        this.height = 1;
    }

    public Cylinder(double r, double h){
        setRadius(r);
        setHeight(h);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDimensions(double r, double h){
        this.radius = r;
        this.height = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        Cylinder c1 = new Cylinder(5, 10);
        System.out.println(c);
        System.out.println(c1);
        c.setDimensions(20, 12);
        System.out.println(c);
    }
}
