package com.example.oose_23_3_back.noticecontrol.control;

import com.example.oose_23_3_back.membercontrol.entity.Member;
import com.example.oose_23_3_back.noticecontrol.service.PostService;
import com.example.oose_23_3_back.noticecontrol.entity.Post;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public Post readPost(@PathVariable("postId") Long postId) {
        return this.postService.readPost(postId);
    }
}
