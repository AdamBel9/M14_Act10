package com.corigo.tech;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.corigo.tech.model.Patient;
import com.corigo.tech.repository.PatientRepository;




@SpringBootApplication
public class MastApplication implements CommandLineRunner {
	@Autowired
	PatientRepository patientRepository ;

	public static void main(String[] args) {
		SpringApplication.run(MastApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		patientRepository.findAll().forEach(p -> System.out.println(p));
		Patient p =patientRepository.findByNom("Mohamedi");
		System.out.println(p.getPrenom());
	}
	;


}
