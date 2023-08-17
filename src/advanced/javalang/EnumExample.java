package javalang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum Dept {
    CS("Head1","Block A"), IT("Head2","Block B"), CIVIL("Head3","Block C"), EC("Head4","Block D");

    String head = "c";
    String location = "d";

     Dept(String head, String location){
        this.head = head;
        this.location = location;
     }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }

    public String getHead() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}
public class EnumExample {

    public static void main(String[] args) {
        Dept d = Dept.CS;

        /*Dept list[] = Dept.values();
        for (Dept el : list) {
            System.out.println(el);
        }*/

        /*switch (d) {
            case CS -> System.out.println("Block A");
            case IT -> System.out.println("Block B");
            case CIVIL -> System.out.println("Block C");
            case EC -> System.out.println("Block D");
        }*/

        System.out.println(d.getHead()+" "+d.getLocation());

    }

}
