package com.example.hello.common.entity;

import java.util.UUID;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class IdEntity extends AuditableEntity {
    private UUID id;
}
