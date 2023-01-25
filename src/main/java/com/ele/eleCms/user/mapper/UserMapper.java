package com.ele.eleCms.user.mapper;

import com.ele.eleCms.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    List<Map<String, Object>> list();
}
