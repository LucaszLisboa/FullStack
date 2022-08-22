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
    public List<Device> myFirstGet()
    {
        return myService.getAllDevices();
    }

    @GetMapping("/{mac}")  //http://localhost:8080/test/<id>
    public String endpointWithParameter(@PathVariable Integer mac)
    {
        System.out.println(mac);      //  /test/5
        return "Hello World " + mac;
    }

    @GetMapping("/v1")  //http://localhost:8080/test/v1?value=<?>
    public String endpointWithQuery(@RequestParam Integer value)
    {
        System.out.println(value);    //  /test/v1?value=4
        return "Hello World " + value;
    }

    @PostMapping
    public Device myFirstPost(@RequestBody Device device)  //http://localhost:8080/test/
    {
        return myService.save(device);
    }

//    @PutMapping("/{mac}")
//    public Device myFirstPut(@RequestBody Device device, @PathVariable String mac)
//    {
//        myService.getDeviceByMac(device.getBrand())
//    }

    @DeleteMapping
    public Device myFirsDelete(@RequestParam Device device)
    {
        return myService.delete(device);
    }
}
