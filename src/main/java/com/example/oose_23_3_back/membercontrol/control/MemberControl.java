package com.example.oose_23_3_back.membercontrol.control;

import com.example.oose_23_3_back.membercontrol.service.MemberService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberControl {
    private final MemberService memberService;

    @GetMapping("/memberSearch")
    public Member memberSelect(@SessionAttribute(name = "member", required = false) Member member) {
        return member;
    }

    @GetMapping("/memberFindAll")
    public List<Member> memberSelect() {
        return this.memberService.getMember();
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest req, HttpServletResponse res) {
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    cookie.setMaxAge(0);
                    res.addCookie(cookie);
                    break;
                }
            }
        }
    }

    @PostMapping("/login")
    public String memberLogin(@RequestBody Member m, HttpServletRequest req) {
        Member loginTarget = this.memberService.getMember(m);

        if (loginTarget != null) {
            HttpSession session = req.getSession();

            if (!loginTarget.getIdentification().equals("admin")) {
                session.setAttribute("member", loginTarget);
                return "member";
            } else {
                session.setAttribute("admin", loginTarget);
                return "admin";
            }
        } else {
            return "fail";
        }
    }
}
