package OOP;

public class RectangleDataHiding {

    private int length;
    private int width;

    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length){
        if (length > 0)
            this.length = length;
    }

    public void setWidth(int width){
        if (width > 0)
        this.width = width;
    }

    public int area(){
        return getLength()*getWidth();
    }

    public int perimeter(){
        return 2*(getLength()+getWidth());
    }

    public String toString() {
        return "RectangleDataHiding{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {
        RectangleDataHiding r = new RectangleDataHiding();
        r.setLength(5);
        r.setWidth(5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }

}
