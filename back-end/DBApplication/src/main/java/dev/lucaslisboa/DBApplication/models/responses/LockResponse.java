package dev.lucaslisboa.DBApplication.models.responses;

import dev.lucaslisboa.DBApplication.domain.Lock;

public class LockResponse {

    private String lockId;
    private String lockName;
    private String lockDescription;
    private String lockImageUrl;

    public LockResponse() {
    }


    public String getLockId() {
        return lockId;
    }

    public String getLockName() {
        return lockName;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public String getLockImageUrl() {
        return lockImageUrl;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public void setLockDescription(String lockDescription) {
        this.lockDescription = lockDescription;
    }

    public void setLockImageUrl(String lockImageUrl) {
        this.lockImageUrl = lockImageUrl;
    }

    @Override
    public String toString() {
        return "LockResponse{" +
                "lockId='" + lockId + '\'' +
                ", lockName='" + lockName + '\'' +
                ", lockDescription='" + lockDescription + '\'' +
                ", lockImageUrl='" + lockImageUrl + '\'' +
                '}';
    }
}
