package com.hypatia.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private String id;
    private String postId;
    private String authorId;
    private String content;
    private String parentCommentId; // para respostas a outros comentários
    private LocalDateTime createdAt;
}
