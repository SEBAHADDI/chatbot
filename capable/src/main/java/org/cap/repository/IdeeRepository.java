package org.cap.repository;

import org.cap.entities.Idee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdeeRepository extends MongoRepository<Idee, String> {

}
