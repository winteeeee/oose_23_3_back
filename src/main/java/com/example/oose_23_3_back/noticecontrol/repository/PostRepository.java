package com.example.oose_23_3_back.noticecontrol.repository;

import com.example.oose_23_3_back.noticecontrol.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
