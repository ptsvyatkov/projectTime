package StaticAndFinal;

class CoffeeMachine {
    private float coffeeQuantity;
    private float waterQuantity;
    private float milkQuantity;
    private float sugarQuantity;
    static private int counter = 0;
    static private CoffeeMachine myMachine = null;

    private CoffeeMachine() {
        coffeeQuantity = 1;
        waterQuantity = 1;
        milkQuantity = 1;
        sugarQuantity = 1;
    }

    static CoffeeMachine getInstance(){
        if (counter < 5) {
            counter++;                                            // Limit to "fixed" number of objects
            return new CoffeeMachine();
        }
        return null;
    }

//    static CoffeeMachine getInstance() {
//        if (myMachine == null)
//            myMachine = new CoffeeMachine();
//        return myMachine;
//    }

    public void fillWater(float quantity) {
        waterQuantity = quantity;
    }

    public void fillSugar(float quantity) {
        sugarQuantity = quantity;
    }

    public float getCoffeeQuantity() {
        return 0.25f;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
    CoffeeMachine cm1 = CoffeeMachine.getInstance();
    CoffeeMachine cm2 = CoffeeMachine.getInstance();
    CoffeeMachine cm3 = CoffeeMachine.getInstance();
    CoffeeMachine cm4 = CoffeeMachine.getInstance();
    CoffeeMachine cm5 = CoffeeMachine.getInstance();
    CoffeeMachine cm6 = CoffeeMachine.getInstance();
        System.out.println(cm1);
        System.out.println(cm2);
        System.out.println(cm3);
        System.out.println(cm4);
        System.out.println(cm5);
        System.out.println(cm6);

    if (cm1 == cm2 && cm2 == cm3 && cm3 == cm4 && cm4 == cm5) {
        System.out.println("Same references");
    }

    }
}
