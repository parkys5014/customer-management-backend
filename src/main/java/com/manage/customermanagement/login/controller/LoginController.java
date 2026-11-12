package com.manage.customermanagement.login.controller;

import com.manage.customermanagement.login.dto.LoginRequest;
import com.manage.customermanagement.login.dto.LoginResponse;
import com.manage.customermanagement.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/api/loginCheck")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }
}
