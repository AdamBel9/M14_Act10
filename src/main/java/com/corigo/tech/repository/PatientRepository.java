package com.corigo.tech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.corigo.tech.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, Long> {
	public Patient findByNom (String nom);
}
