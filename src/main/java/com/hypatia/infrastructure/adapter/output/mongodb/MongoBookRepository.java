package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.Book;
import com.hypatia.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MongoBookRepository implements BookRepository {
    private final SpringDataMongoBookRepository mongoRepository;

    @Override
    public Book save(Book book) {
        return mongoRepository.save(book);
    }

    @Override
    public Optional<Book> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return mongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
