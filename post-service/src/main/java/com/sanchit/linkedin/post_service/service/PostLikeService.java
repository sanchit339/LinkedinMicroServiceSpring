package com.sanchit.linkedin.post_service.service;

import com.sanchit.linkedin.post_service.entity.PostLike;
import com.sanchit.linkedin.post_service.exception.ResourceNotFoundException;
import com.sanchit.linkedin.post_service.repository.PostLikeRepository;
import com.sanchit.linkedin.post_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostLikeService {
    private final PostLikeRepository postLikeRepository;
    private final PostRepository postRepository;

    public void likePost(Long postId, Long userId){
        log.info("Attempting to like the Post with id : {}" , postId);
        boolean exists = postRepository.existsById(postId);

        if(!exists){ throw new ResourceNotFoundException("Post not found with id :- " + postId); }

        boolean alreadyLiked = postLikeRepository.existsByUserIdAndPostId(userId, postId);

        if(alreadyLiked) { // remove the like from the post} \\
        }

        PostLike postLike = new PostLike();
        postLike.setPostId(postId);
        postLike.setUserId(userId);

        postLikeRepository.save(postLike);

        log.info("Post Liked Successfully");
    }
}
