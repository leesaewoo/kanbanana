package com.saewoo.user.dto;

import com.saewoo.common.domain.user.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {

    private String username;

    private String password;

    private String email;

    private String provider;

    private String providerId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime lastLoginAt;

    private Status status;
}
