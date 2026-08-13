package com.sanchit.linkedin.post_service.controller;

import com.sanchit.linkedin.post_service.dto.PostCreateRequestDTO;
import com.sanchit.linkedin.post_service.dto.PostDTO;
import com.sanchit.linkedin.post_service.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
