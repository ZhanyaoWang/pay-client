package com.ruijie.pay.controller;

import com.ruijie.pay.dao.SystemUserJpa;
import com.ruijie.pay.domain.Order;
import com.ruijie.pay.domain.SysUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private Order order;

    @Autowired
    private SystemUserJpa systemUserJpa;

    @GetMapping("/index")
    String home() {
        LOG.info("order info : {}", order);
        SysUserEntity sysUser = new SysUserEntity();
        List<SysUserEntity> allUser = systemUserJpa.findAll();
        LOG.info("user : {}", allUser.size());
        allUser.forEach(user -> {
            LOG.info("user : {}", user.getUserId());
        });
        systemUserJpa.save(sysUser);
        return "Hello World!";
    }
}
