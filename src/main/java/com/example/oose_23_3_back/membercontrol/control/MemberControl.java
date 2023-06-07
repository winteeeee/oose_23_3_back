package com.example.oose_23_3_back.membercontrol.control;

import com.example.oose_23_3_back.membercontrol.service.MemberService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/memberLogin")
    public boolean memberLogin(@RequestBody Member m, HttpServletRequest req) {
        Member loginTarget = this.memberService.getMember(m);

        if (loginTarget != null) {
            HttpSession session = req.getSession();
            session.setAttribute("sessionId", m);
            return true;
        } else {
            return false;
        }
    }
}
