package com.kafein.internship.hotels.dto;

import com.kafein.internship.hotels.enums.Role;
import lombok.Data;

@Data
public class UserSaveRequestDTO {

    private int id;

    private String name;

    private String username;

    private String password;

    private Role role;

    private Boolean active;

}
