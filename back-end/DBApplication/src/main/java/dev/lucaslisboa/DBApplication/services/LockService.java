package dev.lucaslisboa.DBApplication.services;

import dev.lucaslisboa.DBApplication.models.requests.LockRequest;
import dev.lucaslisboa.DBApplication.models.responses.LockResponse;

public interface LockService {

    LockResponse saveLock(LockRequest lockRequest);

    LockResponse getLock(String lockId);

    LockResponse getAllLocks();
}
