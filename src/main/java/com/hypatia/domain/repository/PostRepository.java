package com.hypatia.domain.repository;

import com.hypatia.domain.model.Post;
import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);
    Optional<Post> findById(String id);
    List<Post> findAll();
    void deleteById(String id);
}
