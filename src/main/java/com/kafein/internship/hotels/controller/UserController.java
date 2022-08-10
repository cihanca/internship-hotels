package com.kafein.internship.hotels.controller;

import com.kafein.internship.hotels.dto.UserDTO;
import com.kafein.internship.hotels.dto.UserSaveRequestDTO;
import com.kafein.internship.hotels.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<UserDTO> save(@RequestBody UserSaveRequestDTO dto){
        UserDTO userDTO = userService.save(dto);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable int id){
        UserDTO userDTO = userService.findById(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
