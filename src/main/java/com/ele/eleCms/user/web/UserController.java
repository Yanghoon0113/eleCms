package com.ele.eleCms.user.web;

import com.ele.eleCms.user.model.User;
import com.ele.eleCms.user.model.UserSearch;
import com.ele.eleCms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list")
    public String list(UserSearch userSearch){
        List<Map<String, Object>> list = userService.list(userSearch);
        return "/user/list";
    }

    /*@RequestMapping(value = "/user/insert")
    @ResponseBody
    public Map<String, Object> insert(User user){
        Map<String, Object> resultMap = new HashMap<>();
        userService.insert(user, resultMap);
        return resultMap;
    }*/
}
