package MethodsPracc;

public class VarArgs {

    static void show(int... x) {
        for (int y : x) {
            System.out.print(y+" ");
        }
        System.out.println();
    }

    static void showList(String ...s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+1+". "+s[i]);
        }
    }

    public static void main(String[] args) {
        show();
        show(10);
        show(10,20);
        show(10,20,30);
        show(new int[]{1,2,3,4,5,6}); // anonymous array, created for the time being to be used by method and then deleted
        showList(new String[]{"Asd","asd2","asd3"});
    }
}
