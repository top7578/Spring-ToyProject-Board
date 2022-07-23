package com.example.board.controller;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberTest {

    @Test
    public void member_check() {
        Member member = new Member(1L, "jun");

        Assertions.assertThat(member.getName()).isEqualTo("jun1");
    }

}