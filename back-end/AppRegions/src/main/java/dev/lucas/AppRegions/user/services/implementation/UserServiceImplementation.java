package dev.lucas.AppRegions.user.services.implementation;

import dev.lucas.AppRegions.user.domains.User;
import dev.lucas.AppRegions.user.domains.UserRepository;
import dev.lucas.AppRegions.user.models.requests.UserRequestLogin;
import dev.lucas.AppRegions.user.models.requests.UserUpdateUsernameRequest;
import dev.lucas.AppRegions.user.models.responses.UserResponseLogin;
import dev.lucas.AppRegions.user.models.responses.UserResponse;
import dev.lucas.AppRegions.user.models.requests.UserRequestRegister;
import dev.lucas.AppRegions.user.services.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse saveRegister(UserRequestRegister userRequestRegister) {
        //verify if user already exists
        User byUserEmail = userRepository.findByUserEmail(userRequestRegister.getUserEmail());
        if (byUserEmail != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User already exists");
        }
        else {
            //create user
            ModelMapper modelMapper = new ModelMapper();
            User user = modelMapper.map(userRequestRegister, User.class);
            user.setToken(UUID.randomUUID().toString());
            User userSaved = userRepository.save(user);

            return modelMapper.map(userSaved, UserResponse.class);
        }
    }

    @Override
    public List<UserResponse> getAllUsers() {
        ModelMapper modelMapper = new ModelMapper();
        List<User> allUsers = userRepository.findAll();
        Type listType = new TypeToken<List<UserResponse>>(){}.getType();
        return modelMapper.map(allUsers, listType);
    }

    @Override
    public UserResponseLogin login(UserRequestLogin userRequestLogin) {

        ModelMapper modelMapper = new ModelMapper();

        //verify if email exists
        User byUserEmail = userRepository.findByUserEmail(userRequestLogin.getUserEmail());

        //verify if credentials is correct
        if (byUserEmail != null) {
            if (byUserEmail.getUserPassword().equals(userRequestLogin.getUserPassword()) && byUserEmail.getUserEmail().equals(userRequestLogin.getUserEmail())) {
                byUserEmail.setToken(UUID.randomUUID().toString());
                byUserEmail.setLogged(true);
                User userSaved = userRepository.save(byUserEmail);
                return modelMapper.map(userSaved, UserResponseLogin.class);

            }
            else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Credentials is incorrect");
            }
        }
        else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found");
        }
    }

    @Override
    public UserResponse updateUsername(UserUpdateUsernameRequest userUpdateUsernameRequest, String token) {
        ModelMapper modelMapper = new ModelMapper();
        //verify if token exists
        User byToken = userRepository.findByToken(token);
        if (byToken != null) {
            //update username
            byToken.setUserName(userUpdateUsernameRequest.getUserName());
            User userSaved = userRepository.save(byToken);
            return modelMapper.map(userSaved, UserResponse.class);

        }
        else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid token");
        }
    }
}

