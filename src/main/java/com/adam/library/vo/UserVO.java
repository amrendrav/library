package com.adam.library.vo;

import com.adam.library.domain.Address;
import com.adam.library.enums.UserStatus;
import com.adam.library.enums.UserType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVO {

    private String userId;
    private String parentName;
    private String userName;
    private String phoneNumber;
    private Address address;
    private String userType;
    private String userStatus;
}
