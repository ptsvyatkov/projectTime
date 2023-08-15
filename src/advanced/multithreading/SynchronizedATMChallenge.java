package multithreading;

class Customer extends Thread {
    ATM atm;
    int amount;
    String name;

    public Customer(String name, ATM atm, int amt) {
        this.name = name;
        this.atm = atm;
        this.amount = amt;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}
class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking");
        try {Thread.sleep(1000);} catch (Exception e){}
        System.out.println(" balance");
    }

    synchronized public void withdraw(String name, int amount){
        System.out.print(name+" withdrawing ");
        try {Thread.sleep(1000);} catch (Exception e){}
        System.out.println(amount);
    }
}

public class SynchronizedATMChallenge {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Chuck", atm, 100);
        Customer c2 = new Customer("Norris", atm, 200);
        c1.start();
        c2.start();
    }
}
