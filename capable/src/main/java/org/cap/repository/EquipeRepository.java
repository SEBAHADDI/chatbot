package org.cap.repository;

import org.cap.entities.Equipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipeRepository extends MongoRepository<Equipe, String> {

}
