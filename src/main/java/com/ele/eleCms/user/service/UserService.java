package com.ele.eleCms.user.service;

import com.ele.eleCms.user.model.User;
import com.ele.eleCms.user.model.UserSearch;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserService {
    List<Map<String, Object>> list(UserSearch userSearch);
}
