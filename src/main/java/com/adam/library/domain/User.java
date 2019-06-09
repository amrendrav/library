package com.adam.library.domain;

import com.adam.library.enums.UserStatus;
import com.adam.library.enums.UserType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String userId;
    private String parentName;
    private String userName;
    private String phoneNumber;
    private Address address;
    private UserType userType;
    private UserStatus userStatus;
}
