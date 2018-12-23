package com.az.controller;

import com.az.model.User;
import com.az.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUserList(){
        log.info("UserController getUserList start...");
        List<User> userList = userService.getAllUsers();
        if(CollectionUtils.isEmpty(userList))
            log.info("Size of user List :::: "+userList.size());
        log.info("UserController getUserList end...");

        return userList;
    }


}
