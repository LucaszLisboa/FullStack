package dev.lucaslisboa.DBApplication.services;

import dev.lucaslisboa.DBApplication.domain.Lock;
import dev.lucaslisboa.DBApplication.domain.LockRepository;
import dev.lucaslisboa.DBApplication.models.requests.LockRequest;
import dev.lucaslisboa.DBApplication.models.responses.LockResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LockServiceImpl implements LockService{

    @Autowired
    private LockRepository lockRepository;

    @Override
    public LockResponse saveLock(LockRequest lockRequest) {

        ModelMapper modelMapper = new ModelMapper();
        Lock lock = modelMapper.map(lockRequest, Lock.class);
        lock.setLockId(UUID.randomUUID().toString());

        Lock lockSaved = lockRepository.save(lock);

        return modelMapper.map(lockSaved, LockResponse.class);
    }


    @Override
    public LockResponse getLock(String lockId) {

        ModelMapper modelMapper = new ModelMapper();
        Lock lock = lockRepository.findByLockId(lockId);

        return modelMapper.map(lock, LockResponse.class);
    }

    @Override
    public LockResponse getAllLocks() {
        ModelMapper modelMapper = new ModelMapper();
        List<Lock> locks = lockRepository.findAll();

        return modelMapper.map(locks, LockResponse.class);

    }

}
