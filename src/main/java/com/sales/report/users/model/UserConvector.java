package com.sales.report.users.model;

import com.sales.report.users.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class UserConvector {

    public static UserDTO from(User user) {
        return UserDTO.builder()
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .role(user.getRole())
                .build();
    }

    public static User from(UserDTO userDTO) {
        return User.builder()
                .email(userDTO.getEmail())
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .build();
    }
}
