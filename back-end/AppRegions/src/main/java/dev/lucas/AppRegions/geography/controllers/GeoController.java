package dev.lucas.AppRegions.geography.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoController {

    @GetMapping("/regions/{token}")
    public String getRegions(@PathVariable String token) {
        return "regions";
    }

    @GetMapping("/cities/{token}")
    public String getCities(@PathVariable String token) {
        return "cities";
    }

}
