package com.manage.customerManage.login.controller;

import com.manage.customerManage.login.dto.LoginRequest;
import com.manage.customerManage.login.dto.LoginResponse;
import com.manage.customerManage.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/managemnet")
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "forward:/index.html";
    }

    @PostMapping("/loginCheck")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }
}
