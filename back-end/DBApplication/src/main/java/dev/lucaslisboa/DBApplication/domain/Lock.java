package dev.lucaslisboa.DBApplication.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Lock {

    @Id
    private String id;
    private String lockId;
    private String lockName;
    private String lockDescription;
    private String lockImageUrl;
    private Date creationDate = new Date();

    //CONSTRUTOR
    public Lock() {}


    //GETTERS AND SETTERS
    public String getLockId() {
        return lockId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public void setLockDescription(String lockDescription) {
        this.lockDescription = lockDescription;
    }

    public String getLockImageUrl() {
        return lockImageUrl;
    }

    public void setLockImageUrl(String lockImageUrl) {
        this.lockImageUrl = lockImageUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
