package com.bptn.individ_project._doctor_booking_system;

import java.util.List;

public class Clinic {

	//Declare instance variables
	//Name, address, hours of operation, doctors-arrayList, patients-arrayList
	
	String clinicName;
	String clinicAddress;
	String openHours;
	List <Doctor> doctorsList;
	List<Patient> patientsList;
	
	//Create constructor
	public Clinic(String clinicName, String clinicAddress, String openHours, List <Doctor> doctorsList, List<Patient> patientsList) {
		this.clinicName = clinicName;
		this.clinicAddress = clinicAddress;
		this.openHours = openHours;
		this.doctorsList = doctorsList;
		this.patientsList = patientsList;
	}

	//methods for doctorsList
	public List<Doctor> getDoctorsList() {
		return doctorsList;
	}

	public void setDoctorsList(List<Doctor> doctorsList) {
		this.doctorsList = doctorsList;
	}
	
	public void updateDoctorsList(Doctor newDoctor) {
		doctorsList.add(newDoctor);
	}
	
	// methods for patientsList
	public List<Patient> getPatientsList() {
		return patientsList;
	}

	public void setPatientsList(List<Patient> patientsList) {
		this.patientsList = patientsList;
	}
	
	public void updatePatientsList(Patient newPatient) {
		patientsList.add(newPatient);
	}
	
	public void displayClinicInfo() {
		System.out.println(clinicName + " Address: " + clinicAddress + " Hours of Operation: " + openHours);
	}
	
}
