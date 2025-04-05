package com.saewoo.auth.service;

import com.saewoo.auth.jwt.JwtProvider;
import com.saewoo.common.client.UserClient;
import com.saewoo.common.dto.LoginRequestDto;
import com.saewoo.common.dto.LoginResponseDto;
import com.saewoo.common.dto.UserDto;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    private UserClient userClient;

    @Resource
    private JwtProvider jwtProvider;

    @Override
    public ResponseEntity<LoginResponseDto> login(LoginRequestDto loginRequestDto) {

        try {
            UserDto user = userClient.getUserByEmail(loginRequestDto.getEmail());

            if (!passwordMatches(loginRequestDto.getPassword(), user.getPassword())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(LoginResponseDto.builder().message("비밀번호가 일치하지 않습니다.").build());
            }

            String token = jwtProvider.generateAccessToken(user.getId(), user.getEmail());

            return ResponseEntity.ok(LoginResponseDto.builder()
                    .accessToken(token)
                    .message("로그인 성공")
                    .build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(LoginResponseDto.builder().message("사용자를 찾을 수 없습니다.").build());
        }
    }

    private boolean passwordMatches(String rawPassword, String encodedPassword) {
        return rawPassword.equals(encodedPassword);
    }
}
