package dev.lucaslisboa.DBApplication.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LockRepository  extends MongoRepository<Lock, String> {

    Lock findByLockId(String lockId);

    List<Lock> findAll();

}
