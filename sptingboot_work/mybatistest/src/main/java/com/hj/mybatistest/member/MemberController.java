package com.hj.mybatistest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("aa")
    public ResponseEntity<String> doA(){

        memberRepository.insert();
        return ResponseEntity.ok("aa 돌려줌");
    }
}