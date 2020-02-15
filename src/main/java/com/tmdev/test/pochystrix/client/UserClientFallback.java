package com.tmdev.test.pochystrix.client;

import com.tmdev.test.pochystrix.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    public User getUserById(String id) {
        User hardUser = new User();
        hardUser.setId(id);
        hardUser.setName("Hard User");
        return hardUser;
    }
}
