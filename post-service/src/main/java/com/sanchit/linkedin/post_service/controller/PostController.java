package com.sanchit.linkedin.post_service.controller;

import com.sanchit.linkedin.post_service.dto.PostCreateRequestDTO;
import com.sanchit.linkedin.post_service.dto.PostDTO;
import com.sanchit.linkedin.post_service.entity.Post;
import com.sanchit.linkedin.post_service.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostCreateRequestDTO postCreateRequestDTO){
        PostDTO createdPost = postService.createPost(postCreateRequestDTO, 1L);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<PostDTO> getPost(@PathVariable Long postId){
        System.out.println(postId);
        PostDTO postDTO = postService.getPostById(postId);

        return ResponseEntity.ok(postDTO);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<PostDTO>> getAllPostOfTheUser(@PathVariable Long userId){
        List<PostDTO> allPost = postService.getAllPostOfUser(userId);
        return ResponseEntity<>(allPost, HttpStatus.OK);
    }
}
