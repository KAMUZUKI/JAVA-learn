package com.mu.pojo;

import lombok.Data;

/**
 * @author : MUZUKI
 * @date : 2022-12-16 10:43
 **/

@Data
public class User {
    private int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
