package com.saewoo.user.service;

import com.saewoo.user.dto.UserDto;
import com.saewoo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto getUserByUsername(String username) {
        UserDto userDto = new UserDto();
        userRepository.findByUsername(username).ifPresent(user -> {
            userDto.setUsername(user.getUsername());
            userDto.setEmail(user.getEmail());
        });
        return userDto;
    }
}
