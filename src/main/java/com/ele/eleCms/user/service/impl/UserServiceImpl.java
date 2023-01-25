package com.ele.eleCms.user.service.impl;

import com.ele.eleCms.user.mapper.UserMapper;
import com.ele.eleCms.user.model.User;
import com.ele.eleCms.user.model.UserSearch;
import com.ele.eleCms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map<String, Object>> list(UserSearch userSearch) {
        return userMapper.list();
    }
}
