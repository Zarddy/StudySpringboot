package com.zarddy.studyspringboot.controller;

import com.zarddy.studyspringboot.entity.UserEntity;
import com.zarddy.studyspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/all")
    public List<UserEntity> showAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public List<UserEntity> delete(Long id) {
        userRepository.deleteById(id);
        return userRepository.findAll();
    }
}
