package com.example.oose_23_3_back.noticecontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ManagerSupportControl {
    private final PostService postService;

    @PostMapping("/postNotice")
    public void postNotice(Post post) {
        postService.postNotice(post);
    }

    @GetMapping("/readAllPost")
    public List<Post> readAllPost() {
        return postService.readAllPost();
    }
}
