package com.example.hello.users.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.hello.users.mapper.UserMapper;
import com.example.hello.users.model.UserModel;
import com.example.hello.users.dto.UserDto;
import com.example.hello.users.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;


    @Override
    public List<UserModel> getUsers() {
        return userRepository.findAllUsers()
                .stream()
                .map(userMapper::fromEntity)
                .toList();
    }

    @Override
    public UserModel getUserById(UUID userId) {
        // TODO Auto-generated method stub
        return userMapper.fromEntity(userRepository.findUserById(userId));
    }
}
