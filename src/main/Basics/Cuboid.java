package Basics;

import java.util.Scanner;

public class Cuboid {

    private int length;
    private int height;
    private int width;
    private int volume;
    private int perimeter;
    private int totalArea;

    public Cuboid(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private void calculateVolume() {
        this.volume = getLength() * getWidth() * getHeight();
        System.out.println("The volume of the cube is "+volume);
    }

    private void calculatePerimeter() {
        this.perimeter = 2*getLength()+2*getWidth();
        System.out.println("The perimeter of the cube is "+perimeter);
    }

    private void calculateArea() {
        this.totalArea = 2*(getLength()*getHeight()) +
                         2*(getWidth()*getHeight()) +
                         2*(getLength()*getWidth());
        System.out.println("The area of the cube is "+totalArea);
    }
    public static void main(String[] args) {
        System.out.println("Enter values for length, width, height");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        Cuboid c = new Cuboid(length, height, width);
        c.calculatePerimeter();
        c.calculateVolume();
        c.calculateArea();
        sc.close();
    }
}
