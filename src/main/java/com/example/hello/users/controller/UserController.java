package com.example.hello.users.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.users.dto.UserDto;
import com.example.hello.users.mapper.UserMapper;
import com.example.hello.users.service.UserService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping
    public ResponseEntity<List<UserDto>> index() {
        var users = userService.getUsers()
                    .stream()
                    .map(userMapper::toDto)
                    .toList();
        
        return ResponseEntity.ok(users);
    }
    
}
