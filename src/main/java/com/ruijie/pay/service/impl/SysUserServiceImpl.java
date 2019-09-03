package com.ruijie.pay.service.impl;

import com.ruijie.pay.dao.SystemUserJpa;
import com.ruijie.pay.domain.SysUserEntity;
import com.ruijie.pay.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SystemUserJpa systemUserJpa;

    @Override
    @Cacheable(value = "users")
    public SysUserEntity getUserById(Integer userId) {
        Optional<SysUserEntity> systemUser = systemUserJpa.findById(userId);
        if (systemUser.isPresent()) {
            return systemUser.get();
        }
        return null;
    }
}
