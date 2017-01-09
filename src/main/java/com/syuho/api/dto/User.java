package com.syuho.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    final private String name;
    
    public static User parse(com.syuho.domain.model.account.User user) {
        return new User(user.getUserName());
    }
}
