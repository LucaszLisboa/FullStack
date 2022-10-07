package dev.lucas.AppRegions.user.services.implementation;

import dev.lucas.AppRegions.user.domains.User;
import dev.lucas.AppRegions.user.domains.UserRepository;
import dev.lucas.AppRegions.user.models.UserRegister;
import dev.lucas.AppRegions.user.models.UserRequest;
import dev.lucas.AppRegions.user.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRegister saveRegister(UserRequest userRequest) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userRequest, User.class);
        user.setUserId(UUID.randomUUID().toString());
        User userSaved = userRepository.save(user);

        return modelMapper.map(userSaved, UserRegister.class);
    }

    @Override
    public UserRegister getUser(String userId) {
        User user = userRepository.findByUserId(userId);
        return new ModelMapper().map(user, UserRegister.class);
    }


}

