package com.saewoo.common.client;

import com.saewoo.common.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserClient {

    @GetMapping("/internal/user/email")
    UserDto getUserByEmail(@RequestParam String email);
}
