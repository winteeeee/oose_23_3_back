package com.example.oose_23_3_back.membercontrol.repository;

import com.example.oose_23_3_back.membercontrol.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
    Member findByIdAndPassword(String id, String password);
}
