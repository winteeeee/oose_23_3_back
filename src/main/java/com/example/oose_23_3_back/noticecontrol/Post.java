package com.example.oose_23_3_back.noticecontrol;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postID;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String text;
    @CreatedDate
    private LocalDateTime postDate;
    @ManyToOne
    private Post question;
    @OneToMany(mappedBy = "question")
    private List<Post> answer;

    //TODO private Member poster
    //TODO 대여소에 List<Post> 추가
}
