package com.endava.noSQLTest.service;

import com.endava.noSQLTest.model.Cast;
import com.endava.noSQLTest.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService {
    @Autowired
    private CastRepository castRepository;

    public Cast save (Cast cast) {
        return castRepository.save(cast);
    }
}
