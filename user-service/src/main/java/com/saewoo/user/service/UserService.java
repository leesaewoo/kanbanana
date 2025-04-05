package com.saewoo.user.service;

import com.saewoo.common.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> createUser(UserDto userDto);
}
