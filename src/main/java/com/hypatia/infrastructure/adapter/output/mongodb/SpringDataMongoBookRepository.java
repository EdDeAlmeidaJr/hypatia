package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoBookRepository extends MongoRepository<Book, String> {
}
