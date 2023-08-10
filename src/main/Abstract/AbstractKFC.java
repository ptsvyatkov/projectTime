package Abstract;

abstract class KFC {
    KFC() {

    }
    void makeItem(){

    }
    // KFC says there should be functionality for billing software/hardware
    abstract void billing();

    // KFC says there should be offers for the customers
    abstract void offer();
    protected void display() {
        System.out.println("KFC");
    }
}

class MyKFC extends KFC {
    public MyKFC() {

    }

    @Override
    protected void display(){
        System.out.println("MyKFC");
    }

    // I should define how billing will be done in my kfc
    @Override
    void billing() {

    }

    // I should define what offers there will be for customers
    @Override
    void offer() {

    }
}

public class AbstractKFC {
}
