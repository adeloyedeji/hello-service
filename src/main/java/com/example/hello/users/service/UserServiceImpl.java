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


    //private final UserRepository userMapper2;
    private final UserRepository userRepository2;


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
        //var userRepository = this.getUsers();

        //UserModel user = userRepository2.findById(userId).orElse(() -> new ResourceNotFoundException("User does not exist with the id: " + userId) ).map;
        //UserDto user = this.getUsers().stream().map(userMapper::toDto);
        //UserDto user = userRepository.findById(userId);
        //UserDto user = userRepository.findById(userId);

        //return userRepository.findUserById(userId).map(userMapper::fromDto).toList();
        return userMapper.fromEntity(userRepository.findUserById(userId));
        //throw new UnsupportedOperationException("UserId not found");
    }
}
