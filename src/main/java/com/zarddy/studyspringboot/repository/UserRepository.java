package com.zarddy.studyspringboot.repository;

import com.zarddy.studyspringboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * 相关：
 * 第三章：SpringBoot使用SpringDataJPA完成CRUD
 * https://www.jianshu.com/p/b6932740f3c0
 */
public interface UserRepository extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable {
}
