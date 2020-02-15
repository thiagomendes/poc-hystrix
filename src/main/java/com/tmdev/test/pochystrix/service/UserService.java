package com.tmdev.test.pochystrix.service;

import com.tmdev.test.pochystrix.client.UserClient;
import com.tmdev.test.pochystrix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserClient userClient;

    public User getUserById(String id) {
        return userClient.getUserById(id);
    }
}
