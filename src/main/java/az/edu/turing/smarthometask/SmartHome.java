package az.edu.turing.smarthometask;

import java.util.ArrayList;
import java.util.List;
public class SmartHome implements Manageable {
    private List<User> users;
    private List<Device> devices;

    public SmartHome() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getFirstName());
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User removed: " + user.getFirstName());
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getName());
    }

    public void removeDevice(Device device) {
        devices.remove(device);
        System.out.println("Device removed: " + device.getName());
    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                System.out.println("Device found: " + device.getName());
                System.out.println("Status: " + (device.getStatus() ? "turn on" : "turn off"));
            }
        }

        return null;
    }



    public List<User> getUsers () {
        return users;
    }

    public void setUsers (List < User > users) {
        this.users = users;
    }

    public List<Device> getDevices () {
        return devices;
    }

    public void setDevices (List <Device> devices) {
        this.devices = devices;
    }
}

