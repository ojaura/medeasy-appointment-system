package com.bptn.individ_project._doctor_booking_system;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Doctor extends Person{
	//private int employeeID;
	private String specialty;
	private List<LocalDateTime> availability;
	
	public Doctor(String firstName, String lastName, String gender, String specialty, List<LocalDateTime> availability) {
		super(firstName, lastName, gender);
		//this.employeeID = employeeID;
		this.specialty = specialty;
		this.availability= availability;
	}

	// getter & setter methods for availability
	public List<LocalDateTime> getAvailability() {
		return availability;
	}

	public void setAvailability(ArrayList<LocalDateTime> availability) {
		this.availability = availability;
	}
	
	public void addAvailbleSlot(LocalDateTime newSlot) {
		availability.add(newSlot);
	}
	
	
	public void removeAvailableSlot(LocalDateTime availableSlot) {
		availability.remove(availableSlot);
	}

	// getter & setter methods for specialty
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	// getter & setter methods for employeeID
//	public int getEmployeeID() {
//		return employeeID;
//	}

	public void displayDoctorInfo() {
		String formattedAvailability = FormatDateTime.formatDateTime(availability);
		System.out.println("Dr." + getFirstName() + " " + getLastName() + ", Specialty: " + specialty + ", Gender: " + getGender()  + "\nAvailability:" + formattedAvailability +"\n");
	}

//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}

}
