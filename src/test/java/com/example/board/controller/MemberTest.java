package com.example.board.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberTest {

    @Test
    void name() {
        Member member = Member.builder()
                .name("jun")
                .build();

        Assertions.assertEquals("jun", member.getName());
    }
}