package com.kafein.internship.hotels.service;

import com.kafein.internship.hotels.dto.UserDTO;
import com.kafein.internship.hotels.dto.UserSaveRequestDTO;
import com.kafein.internship.hotels.entity.User;
import com.kafein.internship.hotels.mapper.UserMapper;
import com.kafein.internship.hotels.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public UserDTO save(UserSaveRequestDTO dto) {
        return userMapper.toDTO(userRepository.save(userMapper.toUserFromSaveRequestDTO(dto)));
    }


    public UserDTO findById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("This user is not found with id: " + id));
        return userMapper.toDTO(user);
    }
}
