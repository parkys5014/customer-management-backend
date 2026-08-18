package com.manage.customerManage.login.dao;

import com.manage.customerManage.login.dto.LoginRequest;
import com.manage.customerManage.login.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    User findUser(LoginRequest request);
}
