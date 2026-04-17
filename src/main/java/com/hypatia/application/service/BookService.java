package com.hypatia.application.service;

import com.hypatia.domain.model.Book;
import com.hypatia.domain.repository.BookRepository;
import com.hypatia.application.port.output.FileProcessingPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final FileProcessingPort fileProcessingPort;

    public Book uploadBook(Book book, byte[] fileContent) {
        String extractedText = fileProcessingPort.extractText(fileContent);
        book.setContent(extractedText);
        return bookRepository.save(book);
    }
}
