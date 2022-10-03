package dev.lucaslisboa.DBApplication.models.requests;

public class LockRequest {

    private String lockName;
    private String lockDescription;
    private String lockImageUrl;

    public LockRequest() {
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

    @Override
    public String toString() {
        return "LockRequest{" +
                "lockName='" + lockName + '\'' +
                ", lockDescription='" + lockDescription + '\'' +
                ", lockImageUrl='" + lockImageUrl + '\'' +
                '}';
    }

}
