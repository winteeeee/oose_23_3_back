package com.example.oose_23_3_back.noticecontrol.entity;

import com.example.oose_23_3_back.membercontrol.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postID;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String text;
    @CreatedDate
    private LocalDateTime postDate;
    @ManyToOne
    private Member poster;
}
