package com.hypatia.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String email;
    private String passwordHash;
    private String displayName;
    private String bio;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
}
