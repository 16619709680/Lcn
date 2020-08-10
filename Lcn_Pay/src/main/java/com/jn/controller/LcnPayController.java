package com.jn.controller;

import com.google.inject.internal.cglib.proxy.$Callback;
import com.jn.dao.PayDao;
import com.jn.entity.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LcnPayController {

    @Autowired
    PayDao payDao;

    @PostMapping("/pay")
    @Transactional(rollbackFor = Exception.class)
    public String pay(@RequestBody Pay pay){
        payDao.insert(pay);
        return "Success_Pay";
    }
}
