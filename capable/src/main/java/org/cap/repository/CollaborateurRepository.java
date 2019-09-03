package org.cap.repository;

import org.cap.entities.Collaborateur;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollaborateurRepository extends MongoRepository<Collaborateur, String> {

	@Query("{ 'id' : ?0 }")
	Collaborateur Findcolbyid(String id);
}
