package dev.lucaslisboa.HelloWorld.services.implementation;

import dev.lucaslisboa.HelloWorld.models.Device;
import dev.lucaslisboa.HelloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService
{
    //List mock because we don't have a database . . .
    private final List<Device> myDevices = new ArrayList<>();

    @Override
    public Device save(Device device)
    {
        boolean contains = myDevices.contains(device);

        if(contains) {
            throw new RuntimeException();
        } else{
            myDevices.add(device);
        }

        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        Optional<Device> first = myDevices.stream().filter(device -> device.getMacAddress().equalsIgnoreCase(macAddress)).findFirst();
        Device device = first.get();
        return device;
    }

    @Override
    public List<Device> getAllDevices() {
        return myDevices;
    }


//    public Device delete(Device device)
//    {
//        boolean contains = myDevices.contains(device);
//
//        if(contains) {
//            myDevices.remove(device);
//        } else{
//            System.out.println("n tem");
//            throw new RuntimeException();
//        }
//
//        return device;
//    }

    @Override
    public List<Device> delete(String macAddress){
        Device device = getDeviceByMac(macAddress);
        myDevices.remove(device);
        return myDevices;
    }

}
