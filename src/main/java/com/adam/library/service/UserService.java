package com.adam.library.service;


import com.adam.library.domain.User;
import com.adam.library.enums.UserStatus;
import com.adam.library.enums.UserType;
import com.adam.library.repository.UserRepository;
import com.adam.library.vo.UserVO;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUserDetails(String userId){
        return userRepository.findByUserId(userId);
    }


    public User createUser(UserVO user){
        User newUser = User.builder()
                .parentName(user.getParentName())
                .phoneNumber(user.getPhoneNumber())
                .userId(user.getUserId())
                .userName(user.getUserName())
                .userStatus(UserStatus.valueOf(user.getUserStatus()))
                .userType(UserType.valueOf(user.getUserType()))
                .address(user.getAddress())
                .build();
        return userRepository.save(newUser);
    }

}
