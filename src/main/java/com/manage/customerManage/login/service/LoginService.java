package com.manage.customerManage.login.service;

import com.manage.customerManage.login.dao.LoginDao;
import com.manage.customerManage.login.dto.LoginRequest;
import com.manage.customerManage.login.dto.LoginResponse;
import com.manage.customerManage.login.dto.User;
import com.manage.customerManage.login.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginDao loginDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public LoginResponse login(LoginRequest request) {

        User user = loginDao.findUser(request.getUserId());

        if (user == null) {
            throw new RuntimeException("아이디 또는 비밀번호가 잘못되었습니다.");
        }

        if (!passwordEncoder.matches(request.getPassword(),user.getPassword())) {
            throw new RuntimeException("아이디 또는 비밀번호가 잘못되었습니다.");
        }

        String token = jwtUtil.generateToken(user.getUserId(), user.getRole());

        return new LoginResponse(
                token,
                user.getUserId(),
                user.getUserName(),
                user.getRole()
        );
    }
}