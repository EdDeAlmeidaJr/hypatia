package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoPostRepository extends MongoRepository<Post, String> {
}
