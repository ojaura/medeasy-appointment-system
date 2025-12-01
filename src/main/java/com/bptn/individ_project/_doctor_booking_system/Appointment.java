package com.bptn.individ_project._doctor_booking_system;

import java.time.LocalDateTime;

public class Appointment {
	
	// Instance variables
	private LocalDateTime appointmentDateTime;
	private Doctor doctor;
	private Patient patient;
	
	public Appointment(LocalDateTime appointmentDateTime, Doctor doctor, Patient patient) {
		this.appointmentDateTime = appointmentDateTime;
		this.doctor = doctor;
		this.patient = patient;
	}
	
	//Methods
	
	public void setAppointmentDateTime(LocalDateTime newDateTime) {
		this.appointmentDateTime = newDateTime;
	}
	
	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public String displayAppointmentInfo() {
		return "Details of your appointment:/n" + "Patient: " + patient.getFirstName() + " " + patient.getLastName() + "\n" +
				"Physician: Dr." + doctor.getLastName() + "/nReason for appointment: " + patient.getPatientSymptoms() + "\nDate and Time: " + getAppointmentDateTime(); 
	}
	
//	public static void displayAvailableSlots(Doctor doctor) {
//	
//	// Create a list of the doctor's available time slots
//	List<LocalDateTime> doctorAvailability = doctor.getAvailability();
//	
//	// Display the time slots to the patient/user
//	System.out.println("Available time slots for Dr." + doctor.getLastName() + ": ");
//	for(int i = 0; i < doctorAvailability.size(); i++) {
//		System.out.println(i+1 + ") " + doctorAvailability.get(i));
//	}
//}
//
//public static String bookAppointment(Doctor doctor, Patient patient) {
//	
//	// Show user the doctor's availability	
//	displayAvailableSlots(doctor);
//	//Prompt user to select the time they want
//	System.out.println("Select the number for your desired appointment slot");
//
//	int desiredAppointment = scan.nextInt();
//	
//	List<LocalDateTime> doctorAvailability = doctor.getAvailability();
//	
//	//Retrieve the chosen appointment time
//	LocalDateTime chosenAppt = doctorAvailability.get(desiredAppointment);
//	
//	//Create new appointment
//	Appointment appointment = new Appointment(chosenAppt, doctor, patient);
//	//Remove the time slot from doctor's availability
//	doctor.removeAvailableSlot(chosenAppt);
//	//print success message
//	System.out.println("Your appointment has been succesfully booked!");
//	
//	//scan.close();
//	
//	return appointment.displayAppointmentInfo();
//}

}
