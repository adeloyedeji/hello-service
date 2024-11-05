package com.example.hello.common.entity;

import java.time.Instant;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AuditableEntity {
    private Instant createdAt;
    private Instant updatedAt;
}
