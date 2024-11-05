package com.example.hello.users.entity;

import com.example.hello.common.entity.IdEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity extends IdEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
