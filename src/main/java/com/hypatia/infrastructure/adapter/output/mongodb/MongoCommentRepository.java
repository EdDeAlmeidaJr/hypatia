package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Comment;
import com.hypatia.domain.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MongoCommentRepository implements CommentRepository {
    private final SpringDataMongoCommentRepository mongoRepository;

    @Override
    public Comment save(Comment comment) {
        return mongoRepository.save(comment);
    }

    @Override
    public Optional<Comment> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public List<Comment> findByPostId(String postId) {
        return mongoRepository.findByPostId(postId);
    }

    @Override
    public List<Comment> findByParentCommentId(String parentCommentId) {
        return mongoRepository.findByParentCommentId(parentCommentId);
    }

    @Override
    public List<Comment> findAll() {
        return mongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }

    @Override
    public void deleteByPostId(String postId) {
        mongoRepository.deleteByPostId(postId);
    }
}
