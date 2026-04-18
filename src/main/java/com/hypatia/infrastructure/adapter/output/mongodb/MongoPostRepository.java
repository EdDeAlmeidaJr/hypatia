package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Post;
import com.hypatia.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MongoPostRepository implements PostRepository {
    private final SpringDataMongoPostRepository mongoRepository;

    @Override
    public Post save(Post post) {
        return mongoRepository.save(post);
    }

    @Override
    public Optional<Post> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return mongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
