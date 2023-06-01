package com.example.oose_23_3_back.noticecontrol.control;

import com.example.oose_23_3_back.noticecontrol.service.PostService;
import com.example.oose_23_3_back.noticecontrol.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/noticeFindAll")
    public List<Post> readAllPost() {
        return this.postService.readAllPost();
    }

    @GetMapping("/noticeFind/{postId}")
    public Post readPost(@PathVariable("postId") Integer postId) {
        return this.postService.readPost(postId);
    }
}
