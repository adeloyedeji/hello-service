package com.example.hello.users.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import com.example.hello.users.dto.UserDto;
import com.example.hello.users.entity.UserEntity;
import com.example.hello.users.model.UserModel;

@Mapper(
    unmappedTargetPolicy= ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy= NullValuePropertyMappingStrategy.IGNORE,
    componentModel="spring")
public interface UserMapper {
    UserModel fromEntity(UserEntity userEntity);

    UserEntity toEntity(UserModel userModel);

    UserDto toDto(UserModel userModel);

    UserModel fromDto(UserDto userDto);
}
