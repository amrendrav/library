package com.adam.library.vo;

import com.adam.library.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    private String userId;
    private String parentName;
    private String userName;
    private String phoneNumber;
    private Address address;
    private String userType;
    private String userStatus;
}
