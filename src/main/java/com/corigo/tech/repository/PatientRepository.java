package com.corigo.tech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.corigo.tech.model.Patient;

@RepositoryRestResource (collectionResourceRel="patients", path=" patients")
public interface PatientRepository extends MongoRepository<Patient, Long> {
	public Patient findByNom (String nom);
}
