package dev.lucas.AppRegions.user.services;

import dev.lucas.AppRegions.user.models.UserRegister;
import dev.lucas.AppRegions.user.models.UserRequest;

public interface UserService {

    UserRegister saveRegister(UserRequest userRequest);


    UserRegister getUser(String userId);


}
