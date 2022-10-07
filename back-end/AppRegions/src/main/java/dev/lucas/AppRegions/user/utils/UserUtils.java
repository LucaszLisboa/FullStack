package dev.lucas.AppRegions.user.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserUtils {
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
