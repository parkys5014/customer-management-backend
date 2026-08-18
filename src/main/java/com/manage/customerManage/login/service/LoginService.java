package com.manage.customerManage.login.service;

import com.manage.customerManage.login.dao.LoginDao;
import com.manage.customerManage.login.dto.LoginRequest;
import com.manage.customerManage.login.dto.LoginResponse;
import com.manage.customerManage.login.dto.User;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final LoginDao loginDao;

    public LoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public User login(LoginRequest request) {
        return loginDao.findUser(request);
    }
}