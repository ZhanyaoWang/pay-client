package com.ruijie.pay.dao;

import com.ruijie.pay.domain.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserJpa extends JpaRepository<SysUserEntity, Integer> {

}
