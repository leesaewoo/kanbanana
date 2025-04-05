package com.saewoo.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Data
@NoArgsConstructor @AllArgsConstructor
public class LoginResponseDto {

    private String accessToken;

    private String refreshToken;

    private String message;
}
