package com.manage.customerManage.login.controller;

import com.manage.customerManage.login.dto.LoginRequest;
import com.manage.customerManage.login.dto.User;
import com.manage.customerManage.login.service.LoginService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }
}
