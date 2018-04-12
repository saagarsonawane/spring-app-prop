package com.study.springappprop.controller;

import com.study.springappprop.config.UserConfig;
import com.study.springappprop.model.User;
import com.study.springappprop.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private UserConfig userConfig;

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable final String name){
        User user = userJpaRepository.findByName(name);
        user.setName(userConfig.getCustomMessage()+user.getName());
        return user;
    }

    @GetMapping("/user/all")
    public List<User> getAllUser(){
        return userJpaRepository.findAll();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody final User user){
        User user1 = userJpaRepository.save(user);
        user1.setName(userConfig.getCustomMessage()+user1.getName());
        return user;
    }
}
