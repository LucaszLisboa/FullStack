package dev.lucas.AppRegions.geography.controllers;

//import dev.lucas.AppRegions.geography.controllers.responses.CityResponse;
import dev.lucas.AppRegions.geography.models.responses.CityResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/regions")
public class GeoController {

//    @GetMapping("/all")
//    public CityResponse findAllCities() {
//        return cityService.findAllCities();
//    }

    @GetMapping("/cities/{token}")
    public String getCities(@PathVariable String token) {
        return "cities";
    }

}
