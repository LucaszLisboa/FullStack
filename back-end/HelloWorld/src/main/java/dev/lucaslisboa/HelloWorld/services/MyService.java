package dev.lucaslisboa.HelloWorld.services;

import dev.lucaslisboa.HelloWorld.models.Device;

import java.util.List;

public interface MyService
{
    Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List<Device> getAllDevices();
    List<Device> delete(String macAddress);
}
