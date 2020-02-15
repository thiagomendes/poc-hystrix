package com.tmdev.test.pochystrix.client;

import com.tmdev.test.pochystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        name = "userClientRest",
        url = "http://5e4817c2d9636d0014a1e0d7.mockapi.io",
        fallback = UserClientFallback.class
)
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/user/{id}")
    public User getUserById(@PathVariable("id") String id);
}
