package dev.lucas.AppRegions.user.controllers;

import dev.lucas.AppRegions.user.models.requests.UserRequestLogin;
import dev.lucas.AppRegions.user.models.requests.UserUpdateUsernameRequest;
import dev.lucas.AppRegions.user.models.responses.UserResponseLogin;
import dev.lucas.AppRegions.user.models.responses.UserResponse;
import dev.lucas.AppRegions.user.models.requests.UserRequestRegister;
import dev.lucas.AppRegions.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserResponse saveRegister(@RequestBody UserRequestRegister userRequestRegister) {
        return userService.saveRegister(userRequestRegister);
    }

    @GetMapping("/users")
    public List<UserResponse> findAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/login")
    public UserResponseLogin login(@RequestBody UserRequestLogin userRequestLogin) {
        return userService.login(userRequestLogin);
    }

    @PutMapping("/update/{token}")
    public UserResponse update(@RequestBody UserUpdateUsernameRequest userUpdateRequest, @PathVariable String token) {
        return userService.updateUsername(userUpdateRequest, token);

    }
}
