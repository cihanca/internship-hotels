package com.kafein.internship.hotels.dto;

import com.kafein.internship.hotels.enums.Role;
import lombok.Data;

@Data
public class UserDTO {

    private int id;

    private String name;

    private String username;

    private Role role;

    private Boolean active;

}
