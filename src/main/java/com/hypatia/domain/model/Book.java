package com.hypatia.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String id;
    private String title;
    private String author;
    private String language;
    private String category;
    private String genre;
    private String content;
    private LocalDateTime uploadDate;
    private String uploadedBy;
}
