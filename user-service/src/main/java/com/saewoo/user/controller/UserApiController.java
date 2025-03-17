package com.saewoo.user.controller;

import com.saewoo.user.dto.UserDto;
import com.saewoo.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApiController {

    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/username")
    public UserDto register(@RequestBody UserDto userDto) {
        return userService.getUserByUsername(userDto.getUsername());
    }
}
