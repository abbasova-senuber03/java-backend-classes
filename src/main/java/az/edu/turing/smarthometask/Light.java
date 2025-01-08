package az.edu.turing.smarthometask;

public class Light extends Device {
    public Light(int id, String name) {
        super(id, name,  DeviceType.LIGHT);
    }

    public void turnOn (){
        System.out.println("Light " + getName() + " is on");
    }
    public void turnOff () {
        System.out.println("Light " + getName() + " is  off");
    }
}