package collectionframework;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
            return Integer.compare(this.y, p.y);

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ComparableInterfaceExample {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(3,1));
        ts.add(new Point(2,3));
        ts.add(new Point(2,2));
        System.out.println("Size of tree set: "+ts.size());
        System.out.println(ts);
    }
}
