package com.sanchit.linkedin.post_service.service;

import com.sanchit.linkedin.post_service.dto.PostCreateRequestDTO;
import com.sanchit.linkedin.post_service.dto.PostDTO;
import com.sanchit.linkedin.post_service.entity.Post;
import com.sanchit.linkedin.post_service.exception.ResourceNotFoundException;
import com.sanchit.linkedin.post_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public PostDTO createPost(PostCreateRequestDTO postDTO, Long userId) {
        Post post = modelMapper.map(postDTO, Post.class);
        post.setUserId(userId);

        Post savedPost = postRepository.save(post);
        return modelMapper.map(savedPost, PostDTO.class);
    }

    public PostDTO getPostById(Long postId) {
        log.debug("Retrieving post with Id : {}", postId);
        Post post = postRepository.findById(postId).orElseThrow( () ->
                new ResourceNotFoundException("Post not Found :- " + postId));
        return modelMapper.map(post, PostDTO.class);
    }
}
