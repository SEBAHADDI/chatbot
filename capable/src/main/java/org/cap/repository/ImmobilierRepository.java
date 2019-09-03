package org.cap.repository;

import org.cap.entities.Immobilier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImmobilierRepository extends MongoRepository<Immobilier, String> {

}
