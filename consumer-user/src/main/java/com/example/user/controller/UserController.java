package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {

        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket/getTicket", String.class);


        return "oh year" + s ;
    }
}
