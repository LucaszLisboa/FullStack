package dev.lucas.AppRegions.user.controllers;

import dev.lucas.AppRegions.user.domains.User;
import dev.lucas.AppRegions.user.models.UserModel;
import dev.lucas.AppRegions.user.models.UserRegister;
import dev.lucas.AppRegions.user.models.UserRequest;
import dev.lucas.AppRegions.user.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController(value = "/")
public class UserController {

    @Autowired
    private UserService userService;

    Map<String, UserModel> userMap = new HashMap<>();

    @GetMapping("/login/{userId}")
    public UserRegister login(@PathVariable String userId) {

        return userService.getUser(userId);

    }

    @PostMapping("/register")
    public UserRegister saveRegister(@RequestBody UserRequest userRequest) {

        return userService.saveRegister(userRequest);
    }

    @PutMapping("/update/{token}")
    public String update(@RequestBody UserRequest userRequest, @PathVariable String token) {
        UserModel userModel = userMap.get(token);
        System.out.println(userModel);
        return "update";

    }
}
