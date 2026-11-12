package com.manage.customermanagement.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponse {
    private String accessToken;
    private String userId;
    private String userName;
    private String role;
}
