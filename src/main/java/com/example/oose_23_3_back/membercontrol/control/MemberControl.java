package com.example.oose_23_3_back.membercontrol.control;

import com.example.oose_23_3_back.membercontrol.service.MemberService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberControl {
    private final MemberService memberService;

    @GetMapping("/memberSearch/{identification}")
    public Member memberSelect(@PathVariable("identification") String identification) {
        return this.memberService.getMember(identification);
    }

    @GetMapping("/memberFindAll")
    public List<Member> memberSelect() {
        return this.memberService.getMember();
    }
}
