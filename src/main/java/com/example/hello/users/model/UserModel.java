package com.example.hello.users.model;

import java.time.Instant;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserModel {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
}
