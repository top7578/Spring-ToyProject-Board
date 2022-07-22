package com.example.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/body")
    public String plaintext() {
        return "get 요청";
    }

    @PostMapping("/body2")
    public String plaintext1(@RequestBody Member member) {
        log.info(member.getName());
        return "plain/text 전송옴";
    }
}
