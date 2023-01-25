package com.ele.eleCms.acnt.service.impl;

import com.ele.eleCms.acnt.mapper.AcntMapper;
import com.ele.eleCms.acnt.service.AcntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "acntService")
public class AcntServiceImpl implements AcntService {
    @Autowired
    AcntMapper acntMapper;
}
