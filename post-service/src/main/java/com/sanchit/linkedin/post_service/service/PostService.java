package com.sanchit.linkedin.post_service.service;

import com.sanchit.linkedin.post_service.dto.PostCreateRequestDTO;
import com.sanchit.linkedin.post_service.dto.PostDTO;
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

    public PostDTO createPost(PostCreateRequestDTO postCreateRequestDTO, Long userId) {
        return null;
    }
}
