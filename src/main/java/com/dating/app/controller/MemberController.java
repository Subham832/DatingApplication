package com.dating.app.controller;

import com.dating.app.dto.MemberDTO;
import com.dating.app.model.Member;
import com.dating.app.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/register")
    public Member registerMember(@RequestBody MemberDTO memberDTO) {
        return memberService.registerMember(memberDTO);
    }
}
