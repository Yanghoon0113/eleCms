package com.ele.eleCms.acnt.web;

import com.ele.eleCms.acnt.model.Acnt;
import com.ele.eleCms.acnt.service.AcntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcntController {
    @Autowired
    AcntService acntService;

    @RequestMapping(value = "/acnt/list")
    public String list(Acnt acnt){
        return "/acnt/list";
    }
}
