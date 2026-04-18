package com.hypatia.infrastructure.adapter.output.mongodb;

import com.hypatia.domain.model.User;
import com.hypatia.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MongoUserRepository implements UserRepository {
    private final SpringDataMongoUserRepository mongoRepository;

    @Override
    public User save(User user) {
        return mongoRepository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return mongoRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return mongoRepository.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return mongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
