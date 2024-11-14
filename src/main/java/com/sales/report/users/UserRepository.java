package com.sales.report.users;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {
    Boolean existByEmail(String email);
    Optional<User> findByEmail(String email);
}