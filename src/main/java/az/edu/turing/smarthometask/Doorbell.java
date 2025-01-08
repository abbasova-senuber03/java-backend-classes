package az.edu.turing.smarthometask;

public class Doorbell extends Device {
    public Doorbell(int id, String name) {
        super(id, name,  DeviceType.DOORBELL);
    }
    public void turnOn (){
        System.out.println("Doorbell " + getName() + " is  on");
    }
    public void turnOff (){
        System.out.println("Doorbell " + getName() + " is  off");
    }
    public void ring () {
        System.out.println("Doorbell " + getName() + " is ringing");

    }
}