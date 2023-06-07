package com.example.oose_23_3_back.membercontrol.control;

import com.example.oose_23_3_back.membercontrol.service.MemberService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberRegistrationControl {
    private final MemberService memberService;

    @GetMapping("/idVerification/{id}")
    private boolean idVerification(@PathVariable("id") String id) {
        return this.memberService.idVerification(id);
    }

    @PostMapping("/memberReg")
    public void memberInsert(@RequestBody Member m) {
        this.memberService.insert(m);
    }
}
