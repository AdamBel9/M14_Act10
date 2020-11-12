package com.corigo.tech.model;




import org.springframework.data.annotation.Id;



public class Patient {
	
	//field 
	
	@Id
	private long id ;

	private String nom ;
	
	private String prenom ;
	
	private String dateN ;
	
	private String sexe ;

	//Constructor 
	public Patient() {}
	public Patient(int id, String nom, String prenom, String dateN, String sexe) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateN = dateN;
		this.sexe = sexe;

	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Patient" + nom;
	}
	   
	
	

	
	
	
	
	

}
