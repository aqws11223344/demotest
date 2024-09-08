package com.example.demo.controller;

import com.example.demo.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/api/users")
    public List<User> getUsers() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("test1");
        user1.setPhoneNumber("09123456789");
        user1.setCreatTime(LocalDateTime.now());

        User user2 = new User();
        user2.setId(2);
        user1.setName("test2");
        user2.setPhoneNumber("09123456789");
        user2.setCreatTime(LocalDateTime.now());

        return Arrays.asList(user1, user2);
    }
}
