package com.sda.auction.mapper;

import com.sda.auction.dto.UserDto;
import com.sda.auction.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User convert(UserDto userDto) {//primeste userDto si intoarce un User
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());

        return user;
    }

    public UserDto convert(User user) {//primeste user si intoarce UserDto
        UserDto userDto = new UserDto();

        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());

        userDto.setId(user.getId());
        return userDto;
    }
}
