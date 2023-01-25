package com.ele.eleCms.lctr.web;

import com.ele.eleCms.lctr.model.LctrSearch;
import com.ele.eleCms.lctr.service.LctrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LctrController {
    @Autowired
    LctrService lctrService;

    @RequestMapping(value = "/lctr/list")
    public String list(LctrSearch lctrSearch){
        return "/lctr/list";
    }
}
