package com.example.board.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Value("${jwt.secret-key}")
    String key;

    @GetMapping("/oauth")
    public String oauth() {

        return key;
    }
}
