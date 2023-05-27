package com.example.oose_23_3_back.membercontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class MemberRegistrationControl {
    private final MemberService memberService;

    private boolean idVerification(String id) {
        return this.memberService.idVerification(id);
    }

    private boolean passwordVerification(String password) {
        return this.memberService.passwordVerification(password);
    }

    private boolean rentalPasswordVerification(String rentalPassword) {
        return this.memberService.rentalPasswordVerification(rentalPassword);
    }


    @PostMapping("/memberReg")
    public void memberInsert(Member m) {
        this.memberService.insert(m);
    }
}
