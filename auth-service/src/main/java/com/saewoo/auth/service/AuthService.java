package com.saewoo.auth.service;

import com.saewoo.common.dto.LoginRequestDto;
import com.saewoo.common.dto.LoginResponseDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<LoginResponseDto> login(LoginRequestDto loginRequestDto);
}
