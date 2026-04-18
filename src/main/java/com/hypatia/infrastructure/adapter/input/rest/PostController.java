package com.hypatia.infrastructure.adapter.input.rest;

import com.hypatia.application.service.PostService;
import com.hypatia.domain.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable String id) {
        return postService.findById(id);
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable String id) {
        postService.deletePost(id);
    }
}
