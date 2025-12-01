package com.bptn.individ_project._doctor_booking_system;

import java.util.List;

public class Patient extends Person{
	
	//Declare instance variables
	String emailAddress;
	List<String> symptoms;
	long healthcardNum;

	//Create constructor
	public Patient(String firstName, String lastName, String gender, String emailAddress, List<String> symptoms, long healthcardNum) {
		super(firstName, lastName, gender);
		this.emailAddress = emailAddress;
		this.symptoms = symptoms;
		this.healthcardNum = healthcardNum;
	}
	
	//Create setter methods
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	//Create getter methods
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public long getHealthcardNumber() {
		return healthcardNum;
	}
	
	public List<String> getPatientSymptoms() {
		return symptoms;
	}
	
	//@Override
	//public String toString() {
	public String getPatientInfo() {
		return "Patient Details:\nFirst Name: " + getFirstName() + " | Last Name: " + getLastName() + 
				" | Healthcard Number: "+ getHealthcardNumber() + "\nEmail Address: "+ getEmailAddress() + 
				" | Gender: " + getGender() + " | Reason(s) for appointment: " + String.join(", ", getPatientSymptoms()); 
	}
}
