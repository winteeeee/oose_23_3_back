package com.example.oose_23_3_back.membercontrol.service;

import com.example.oose_23_3_back.membercontrol.repository.MemberRepository;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public boolean idVerification(String id) {
        Optional<Member> member = Optional.ofNullable(this.memberRepository.findByIdentification(id));
        return member.isEmpty();
    }

    public boolean passwordVerification(String password) {
        Optional<Member> member= Optional.ofNullable(this.memberRepository.findByPassword(password));
        return member.isEmpty();
    }

    public boolean rentalPasswordVerification(String rentalPassword) {
        Optional<Member> member= Optional.ofNullable(this.memberRepository.findByRentalPassword(rentalPassword));
        return member.isEmpty();
    }

    public Member getMember(Integer memberNumber) {
        Optional<Member> member = this.memberRepository.findById(memberNumber);
        return member.orElse(null);
    }

    public void insert(Member m) {
        m.setRegistrationDate(LocalDateTime.now());
        this.memberRepository.save(m);
    }
}
