package com.manage.customermanagement.login.dao;

import com.manage.customermanagement.login.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    User findUser(String request);
}
