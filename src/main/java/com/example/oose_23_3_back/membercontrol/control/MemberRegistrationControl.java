package com.example.oose_23_3_back.membercontrol.control;

import com.example.oose_23_3_back.membercontrol.service.MemberService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberRegistrationControl {
    private final MemberService memberService;
    @PostMapping("/memberReg")
    public String memberInsert(@RequestBody Member m) {
        if (this.memberService.idVerification(m.getIdentification())) {
            this.memberService.insert(m);
            return "success";
        } else {
            return "fail";
        }
    }
}
