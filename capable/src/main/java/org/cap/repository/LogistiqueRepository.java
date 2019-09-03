package org.cap.repository;

import org.cap.entities.Logistique;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogistiqueRepository extends MongoRepository<Logistique, String> {

}
