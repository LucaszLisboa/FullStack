package dev.lucaslisboa.HelloWorld.controllers;

import dev.lucaslisboa.HelloWorld.models.Device;
import dev.lucaslisboa.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyEndpoints
{
    @Autowired
    private MyService myService;

    @GetMapping  //http://localhost:8080/test
    public List<Device> myFirstGet(){
        return myService.getAllDevices();
    }

    @GetMapping("/{mac}")  //http://localhost:8080/test/<id>
    public Device endpointWithParameter(@PathVariable String mac){
        System.out.println(myService.getDeviceByMac(mac));
        return myService.getDeviceByMac(mac);
    }

    @GetMapping("/v1")  //http://localhost:8080/test/v1?value=<?>
    public String endpointWithQuery(@RequestParam Integer value){
        System.out.println(value);
        return "Hello World " + value;
    }

    @PostMapping   //http://localhost:8080/test/
    public Device myFirstPost(@RequestBody Device device){
        return myService.save(device);
    }

    @PutMapping("/{mac}")
    public Device myFirstPut(@RequestBody Device device, @PathVariable String mac) {
        myService.getDeviceByMac(mac).setName(device.getName());
        myService.getDeviceByMac(mac).setBrand(device.getBrand());
        myService.getDeviceByMac(mac).setWifi(device.getWifi());

        return device;
    }

    @DeleteMapping
    public Device myFirsDelete(@RequestBody Device device){
        return myService.delete(device);
    }
}
