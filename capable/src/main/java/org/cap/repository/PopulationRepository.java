package org.cap.repository;

import org.cap.entities.Population;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PopulationRepository extends MongoRepository<Population, String> {

}
