package com.hypatia.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String id;
    private String content;
    private String authorId;
    private PostType type;
    private BookType bookType;
    private String language;
    private String genre;
    private String relatedBookId;
    private String imageUrl;
    private LocalDateTime createdAt;
    private List<Comment> comments;
}
