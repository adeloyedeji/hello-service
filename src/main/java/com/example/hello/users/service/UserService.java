package com.example.hello.users.service;

import java.util.List;
import java.util.UUID;

import com.example.hello.users.model.UserModel;

public interface UserService {
    List<UserModel> getUsers();

    UserModel getUserById(UUID userId);
}
