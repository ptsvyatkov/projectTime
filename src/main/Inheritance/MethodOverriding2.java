package Inheritance;

class TV {
    public void switchOn() {
        System.out.println("TV is switched on.");
    }

    public void changeChannel() {
        System.out.println("TV channel changed.");
    }
}

class SmartTV extends TV{
    @Override
    public void switchOn() {
        System.out.println("Smart TV is switched on.");
    }
    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel changed.");
    }
    public void browse() {
        System.out.println("Smart TV browsing.");
    }
}

public class MethodOverriding2 {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.switchOn();
        System.out.println("A tv is an instance of a SmartTV? " + (tv instanceof SmartTV) +"\n");

        SmartTV sm = new SmartTV();
        sm.switchOn();
        sm.browse();
        System.out.println("A Smart TV is an instance of a TV? " + (sm instanceof TV) +"\n");

        TV smtv = new SmartTV();
        smtv.switchOn();
        smtv.changeChannel();
        ((SmartTV) smtv).browse(); // typecasting (downcasting possible only to a subclass, otherwise cannot compile)
        System.out.println(smtv instanceof TV && smtv instanceof SmartTV);
        // error ClassCastException --> TV is-not-a SmartTV
        /*SmartTV tv1 = (SmartTV) new TV();

        TV thetv = new SmartTV();*/
    }

}
