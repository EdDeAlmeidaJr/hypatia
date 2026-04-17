package com.hypatia.domain.repository;

import com.hypatia.domain.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book book);
    Optional<Book> findById(String id);
    List<Book> findAll();
    void deleteById(String id);
}
