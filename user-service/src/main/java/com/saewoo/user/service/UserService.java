package com.saewoo.user.service;

import com.saewoo.user.dto.UserDto;

public interface UserService {

    UserDto getUserByUsername(String username);
}
