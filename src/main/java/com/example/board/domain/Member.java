package com.example.board.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Member {
    Long id;
    String name;

    public Member(Long id, String name) {
        this.name = name;
    }
}
