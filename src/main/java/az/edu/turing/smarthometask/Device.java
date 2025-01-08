package az.edu.turing.smarthometask;

public abstract class Device {
    public enum DeviceType { LIGHT, THERMOSTAT, CAMERA, DOORBELL}
    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device (int id, String name, DeviceType deviceType){
        this.id= id;
        this.name=name;
        this.status=false;
        this.deviceType=deviceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public void turnOn (){
        this.status = true;
        System.out.println(name + " turned on");
    }
    public void turnOff (){
        this.status = false;
        System.out.println(name + " turned off");
    }
    public boolean getStatus (){
        return status;
    }
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name= name;
    }


}