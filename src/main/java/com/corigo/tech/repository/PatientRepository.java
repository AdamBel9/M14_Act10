package com.corigo.tech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corigo.tech.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, Long> {
	public Patient findByNom (String nom);
}
