package com.hypatia.domain.repository;

import com.hypatia.domain.model.Comment;
import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    Comment save(Comment comment);
    Optional<Comment> findById(String id);
    List<Comment> findByPostId(String postId);
    List<Comment> findByParentCommentId(String parentCommentId);
    List<Comment> findAll();
    void deleteById(String id);
    void deleteByPostId(String postId);
}
