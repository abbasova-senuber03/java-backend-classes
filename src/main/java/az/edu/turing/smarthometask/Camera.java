package az.edu.turing.smarthometask;

public class Camera extends Device{
    public Camera(int id, String name){
        super(id,name,DeviceType.CAMERA);
    }

    public void turnOn() {
        System.out.println(getName() + " camera is on.");
    }

    public void turnOff(){
        System.out.println(getName() +" camera is off.");
    }

    public void starRecording() {
        System.out.println(getName() + "camera started recording.");
    }

    public void stopRecording(){
        System.out.println(getName()+ "camera started recording.");
    }
}
