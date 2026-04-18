package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SpringDataMongoCommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByPostId(String postId);
    List<Comment> findByParentCommentId(String parentCommentId);
    void deleteByPostId(String postId);
}
