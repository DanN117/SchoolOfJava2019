package com.endava.noSQLTest.repository;

import com.endava.noSQLTest.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepository extends MongoRepository<Cast, String> {

}
