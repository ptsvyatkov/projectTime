package Interfaces;

class Phone{
    void call(){
        System.out.println("Phone call.");
    }
    void sms(){
        System.out.println("Phone sms.");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer {

    public void videoCall() {
        System.out.println("SmartPhone videocall.");
    }
    @Override
    public void click() {
        System.out.println("Smartphone click.");
    }

    @Override
    public void record() {
        System.out.println("Smartphone recording.");
    }

    @Override
    public void play() {
        System.out.println("Smartphone playing music");
    }

    @Override
    public void stop() {
        System.out.println("Smartphone stopping music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        ICamera c = new SmartPhone();
        IMusicPlayer mp = new SmartPhone();
        Phone p = new SmartPhone();

        sp.videoCall();
        c.click();
        mp.play();
        p.call();
    }
}
