package com.example.oose_23_3_back.membercontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberControl {
    private final MemberService memberService;

    @GetMapping("/memberRead")
    public Member memberSelect(Integer memberNumber) {
        return this.memberService.getMember(memberNumber);
    }
}
