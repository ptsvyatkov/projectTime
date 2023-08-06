package Interfaces;

interface IMember {
    void callback();
}
class Customer implements IMember {
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    public void callback() {
        System.out.println(name+" will be visiting the store.");
    }
}
class Store {
    IMember[] mem = new IMember[100];
    int count = 0;

    void register(IMember member){
        mem[count++] = member;
    }

    void inviteForSale(){
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer("Smith");
        Customer c2 = new Customer("Shook");

        s.register(c);
        s.register(c2);
        s.inviteForSale();
    }
}
