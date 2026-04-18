package com.hypatia.infrastructure.adapter.input.rest;

import com.hypatia.application.service.SearchService;
import com.hypatia.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @GetMapping("/books")
    public List<Book> searchBooks(
            @RequestParam(required = false) String language,
            @RequestParam(required = false) String bookType,
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) String keyword) {
        return searchService.searchBooks(language, bookType, genre, keyword);
    }
}
