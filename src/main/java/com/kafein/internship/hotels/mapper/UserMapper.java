package com.kafein.internship.hotels.mapper;


import com.kafein.internship.hotels.dto.UserDTO;
import com.kafein.internship.hotels.dto.UserSaveRequestDTO;
import com.kafein.internship.hotels.dto.UserShortDTO;
import com.kafein.internship.hotels.entity.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Named("toDTO")
    UserDTO toDTO(User entity);

    @Named("toEntity")
    User toEntity(UserDTO dto);

    @IterableMapping(qualifiedByName = "toDTO")
    List<UserDTO> toDTOList(List<User> entityList);

    @IterableMapping(qualifiedByName = "toEntity")
    List<User> toEntityList(List<UserDTO> dtoList);

    UserShortDTO toUserShortDTO(User entity);

    User toUserFromSaveRequestDTO(UserSaveRequestDTO dto);

}
