package com.dating.app.repository;

import com.dating.app.model.Interest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestRepository extends MongoRepository<Interest, String> {
}
