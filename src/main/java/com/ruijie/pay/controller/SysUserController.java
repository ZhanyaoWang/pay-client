package com.ruijie.pay.controller;

import com.ruijie.pay.domain.SysUserEntity;
import com.ruijie.pay.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    private static final Logger LOG = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getUser")
    @ResponseBody
    public SysUserEntity getUser(Integer userId) {
        SysUserEntity user = sysUserService.getUserById(userId);
        return user;
    }
}
