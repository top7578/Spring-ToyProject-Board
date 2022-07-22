package com.example.board.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Member {

    Long id;
    String name;
    String nickname;
    public Member(Long id, String name) {
        this.name = name;
    }
}
