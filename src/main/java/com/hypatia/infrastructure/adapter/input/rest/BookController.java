package com.hypatia.infrastructure.adapter.input.rest;

import com.hypatia.application.service.BookService;
import com.hypatia.domain.model.Book;
import com.hypatia.domain.model.BookType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/upload")
    public Book uploadBook(
            @RequestParam("file") MultipartFile file,
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            @RequestParam("language") String language,
            @RequestParam("type") String type,
            @RequestParam("genre") String genre,
            @RequestParam("uploadedBy") String uploadedBy) throws IOException {
        
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setLanguage(language);
        book.setType(BookType.valueOf(type.toUpperCase()));
        book.setGenre(genre);
        book.setUploadedBy(uploadedBy);
        
        return bookService.uploadBook(book, file.getBytes());
    }
}
