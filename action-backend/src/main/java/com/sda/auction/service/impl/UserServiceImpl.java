package com.sda.auction.service.impl;

import com.sda.auction.dto.UserDto;
import com.sda.auction.mapper.UserMapper;
import com.sda.auction.model.User;
import com.sda.auction.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public UserDto addUser(UserDto userDto) {
        //convertim dto in entity
        User user = userMapper.convert(userDto);
        return null;
    }
}
