package dev.lucas.AppRegions.user.services;

import dev.lucas.AppRegions.user.models.requests.UserRequestLogin;
import dev.lucas.AppRegions.user.models.requests.UserUpdateUsernameRequest;
import dev.lucas.AppRegions.user.models.responses.UserResponse;
import dev.lucas.AppRegions.user.models.requests.UserRequestRegister;
import dev.lucas.AppRegions.user.models.responses.UserResponseLogin;

import java.util.List;

public interface UserService {

    UserResponse saveRegister(UserRequestRegister userRequest);
    List<UserResponse> getAllUsers();
    UserResponseLogin login(UserRequestLogin token);
    UserResponse updateUsername(UserUpdateUsernameRequest userUpdateUsernameRequest, String token);
}
