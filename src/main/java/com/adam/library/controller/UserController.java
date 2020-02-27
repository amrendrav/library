package com.adam.library.controller;

import com.adam.library.domain.User;
import com.adam.library.service.UserService;
import com.adam.library.utility.PreConditionValidator;
import com.adam.library.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/library")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{userId}")
    public User getDetails(@PathVariable String userId ){

        log.info("pulling details for the user {}", userId);

        return userService.getUserDetails(userId);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserVO user){
        log.info("Creating user with userId : {} and parentsName  : {}", user.getUserId(), user.getParentName());
        PreConditionValidator.checkFound(user.getParentName());


        User result = userService.createUser(user);

        log.info("User created successfully {}", result.toString());

        return result;
    }


    @PutMapping(value = "/{userId}")
    public String updateUser(@PathVariable String userId){
        log.info(userId);
        return "Helloo"  + userId;
    }


}
