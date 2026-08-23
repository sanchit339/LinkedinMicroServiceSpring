package com.sanchit.linkedin.post_service.repository;

import com.sanchit.linkedin.post_service.entity.Post;
import com.sanchit.linkedin.post_service.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PostLike, Long > {

    // Explicit Query apart from the default queries are present here
    // in case the following does not create a proper JPQL then we can write the custom query
    boolean existsByUserIdAndPostId(Long userId, Long postId);
}
