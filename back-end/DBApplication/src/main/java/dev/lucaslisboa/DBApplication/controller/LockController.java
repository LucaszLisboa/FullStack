package dev.lucaslisboa.DBApplication.controller;

import dev.lucaslisboa.DBApplication.models.requests.LockRequest;
import dev.lucaslisboa.DBApplication.models.responses.LockResponse;
import dev.lucaslisboa.DBApplication.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/")
public class LockController {

    @Autowired
    private LockService lockService;

    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest){
        return lockService.saveLock(lockRequest);
    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId)
    {
        return lockService.getLock(lockId);
    }

    @GetMapping("/")
    public LockResponse getAllLocks()
    {
        return lockService.getAllLocks();
    }


}
