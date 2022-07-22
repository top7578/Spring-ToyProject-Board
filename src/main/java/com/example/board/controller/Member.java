package com.example.board.controller;

import lombok.Builder;
import lombok.Getter;

@Builder @Getter
public class Member {
  Long id;
  String name;




  public Member(Long id, String name) {
    this.name = name;
  }
}
