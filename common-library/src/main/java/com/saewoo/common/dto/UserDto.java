package com.saewoo.common.dto;

import com.saewoo.common.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder @Data
@NoArgsConstructor @AllArgsConstructor
public class UserDto {

    private long id;

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
