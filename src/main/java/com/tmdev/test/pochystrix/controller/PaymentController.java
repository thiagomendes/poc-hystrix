package com.tmdev.test.pochystrix.controller;

import com.tmdev.test.pochystrix.dto.PaymentDto;
import com.tmdev.test.pochystrix.entity.User;
import com.tmdev.test.pochystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private UserService userService;


    @GetMapping("/payments/{id}")
    public PaymentDto getPayments(@PathVariable("id") Long id) {

        PaymentDto paymentDto = new PaymentDto();

        User user = userService.getUserById("1");
        paymentDto.setUserId(user.getId());
        paymentDto.setUserName(user.getName());

        paymentDto.setPaymentId(id);

        return paymentDto;
    }
}
