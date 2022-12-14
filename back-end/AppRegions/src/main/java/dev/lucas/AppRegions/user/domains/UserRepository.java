package dev.lucas.AppRegions.user.domains;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByToken(String token);
    User findByUserEmail(String userEmail);
}
