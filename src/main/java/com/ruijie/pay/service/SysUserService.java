package com.ruijie.pay.service;

import com.ruijie.pay.dao.SystemUserJpa;
import com.ruijie.pay.domain.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;

public interface SysUserService {

    public SysUserEntity getUserById(Integer userId);
}
