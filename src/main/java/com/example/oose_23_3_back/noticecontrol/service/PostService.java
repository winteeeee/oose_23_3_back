package com.example.oose_23_3_back.noticecontrol.service;

import com.example.oose_23_3_back.noticecontrol.repository.PostRepository;
import com.example.oose_23_3_back.noticecontrol.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public void postNotice(Post post) {
        this.postRepository.save(post);
    }

    public List<Post> readAllPost() {
        return postRepository.findAll();
    }

    public Post readPost(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }
}
