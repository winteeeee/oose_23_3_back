package com.example.oose_23_3_back.noticecontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
