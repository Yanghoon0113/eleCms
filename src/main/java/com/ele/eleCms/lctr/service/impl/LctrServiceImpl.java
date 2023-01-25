package com.ele.eleCms.lctr.service.impl;

import com.ele.eleCms.lctr.mapper.LctrMapper;
import com.ele.eleCms.lctr.service.LctrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "lctrService")
public class LctrServiceImpl implements LctrService {
    @Autowired
    LctrMapper lctrMapper;
}
