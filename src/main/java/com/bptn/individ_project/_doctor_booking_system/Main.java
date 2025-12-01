package com.bptn.individ_project._doctor_booking_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		//availability for doctors
//        List<LocalDateTime> doctor1Availability = new ArrayList<>();
//        doctor1Availability.add(LocalDateTime.of(2024, 10, 19, 10, 0));
//        doctor1Availability.add(LocalDateTime.of(2024, 10, 19, 11, 0));
//
//        List<LocalDateTime> doctor2Availability = new ArrayList<>();
//        doctor2Availability.add(LocalDateTime.of(2024, 10, 20, 14, 0));
//        doctor2Availability.add(LocalDateTime.of(2024, 10, 20, 15, 0));
		
		// availability schedules
        List<LocalDateTime> availability1 = new ArrayList<>();
        availability1.add(LocalDateTime.of(2024, 10, 19, 10, 0));
        availability1.add(LocalDateTime.of(2024, 10, 19, 11, 0));
        availability1.add(LocalDateTime.of(2024, 10, 19, 12, 0));
        availability1.add(LocalDateTime.of(2024, 10, 20, 10, 0));
        availability1.add(LocalDateTime.of(2024, 10, 20, 11, 0));

        List<LocalDateTime> availability2 = new ArrayList<>();
        availability2.add(LocalDateTime.of(2024, 10, 20, 14, 0));
        availability2.add(LocalDateTime.of(2024, 10, 20, 15, 0));
        availability2.add(LocalDateTime.of(2024, 10, 20, 16, 0));
        availability2.add(LocalDateTime.of(2024, 10, 21, 14, 0));
        availability2.add(LocalDateTime.of(2024, 10, 21, 15, 0));
		
        // Creating doctors for each specialty with additional availability
        List<Doctor> doctorsList = new ArrayList<>();
        
        // Cardiologists
        doctorsList.add(new Doctor("John", "Smith", "Male", "Cardiologist", availability1));
        doctorsList.add(new Doctor("Michael", "Johnson", "Male", "Cardiologist", availability2));
        doctorsList.add(new Doctor("Anna", "Williams", "Female", "Cardiologist", availability1));
        doctorsList.add(new Doctor("Emma", "Brown", "Female", "Cardiologist", availability2));

        // Dermatologists
        doctorsList.add(new Doctor("Jane", "Doe", "Female", "Dermatologist", availability1));
        doctorsList.add(new Doctor("Linda", "White", "Female", "Dermatologist", availability2));
        doctorsList.add(new Doctor("David", "Black", "Male", "Dermatologist", availability1));
        doctorsList.add(new Doctor("James", "Green", "Male", "Dermatologist", availability2));

        // General Practitioners
        doctorsList.add(new Doctor("Julia", "Davis", "Female", "Primary Care", availability1));
        doctorsList.add(new Doctor("Sophia", "Taylor", "Female", "General Practioner", availability2));
        doctorsList.add(new Doctor("Robert", "Wilson", "Male", "Primary Care", availability1));
        doctorsList.add(new Doctor("William", "Moore", "Male", "General Practitioner", availability2));

        // Neurologists
        doctorsList.add(new Doctor("Alice", "Miller", "Female", "Neurologist", availability1));
        doctorsList.add(new Doctor("Olivia", "Anderson", "Female", "Neurologist", availability2));
        doctorsList.add(new Doctor("Ethan", "Thomas", "Male", "Neurologist", availability1));
        doctorsList.add(new Doctor("Mason", "Jackson", "Male", "Neurologist", availability2));

        // Orthopedists
        doctorsList.add(new Doctor("Chris", "Lee", "Male", "Orthopedist", availability1));
        doctorsList.add(new Doctor("Nathan", "Scott", "Male", "Orthopedist", availability2));
        doctorsList.add(new Doctor("Emily", "Clark", "Female", "Orthopedist", availability1));
        doctorsList.add(new Doctor("Rachel", "Lopez", "Female", "Orthopedist", availability2));

        // ENT Specialists
        doctorsList.add(new Doctor("Brian", "Hill", "Male", "ENT Specialist", availability1));
        doctorsList.add(new Doctor("Mark", "Allen", "Male", "ENT Specialist", availability2));
        doctorsList.add(new Doctor("Ava", "Hall", "Female", "ENT Specialist", availability1));
        doctorsList.add(new Doctor("Grace", "King", "Female", "ENT Specialist", availability2));

        // Ophthalmologists
        doctorsList.add(new Doctor("Peter", "Walker", "Male", "Ophthalmologist", availability1));
        doctorsList.add(new Doctor("Lucas", "Young", "Male", "Ophthalmologist", availability2));
        doctorsList.add(new Doctor("Chloe", "Baker", "Female", "Ophthalmologist", availability1));
        doctorsList.add(new Doctor("Ella", "Scott", "Female", "Ophthalmologist", availability2));

        // Gastroenterologists
        doctorsList.add(new Doctor("Dylan", "Carter", "Male", "Gastroenterologist", availability1));
        doctorsList.add(new Doctor("Jacob", "Phillips", "Male", "Gastroenterologist", availability2));
        doctorsList.add(new Doctor("Lily", "Evans", "Female", "Gastroenterologist", availability1));
        doctorsList.add(new Doctor("Mia", "Collins", "Female", "Gastroenterologist", availability2));

        // Psychologists
        doctorsList.add(new Doctor("Liam", "Turner", "Male", "Psychologist", availability1));
        doctorsList.add(new Doctor("Henry", "Cooper", "Male", "Psychologist", availability2));
        doctorsList.add(new Doctor("Zoe", "Parker", "Female", "Psychologist", availability1));
        doctorsList.add(new Doctor("Lucy", "Adams", "Female", "Psychologist", availability2));

        // Gynecologists
        doctorsList.add(new Doctor("Samantha", "Mitchell", "Female", "Gynecologist", availability1));
        doctorsList.add(new Doctor("Nora", "Brooks", "Female", "Gynecologist", availability2));
        doctorsList.add(new Doctor("Sarah", "Reed", "Female", "Gynecologist", availability1));
        doctorsList.add(new Doctor("Megan", "Kelly", "Female", "Gynecologist", availability2));

        // Urologists
        doctorsList.add(new Doctor("Oscar", "Bennett", "Male", "Urologist", availability1));
        doctorsList.add(new Doctor("Logan", "Murphy", "Male", "Urologist", availability2));
        doctorsList.add(new Doctor("Hannah", "Gray", "Female", "Urologist", availability1));
        doctorsList.add(new Doctor("Amelia", "Ward", "Female", "Urologist", availability2));
        
        
//        Doctor doctor1 = new Doctor("John", "Smith", "Male", "Cardiologist", doctor1Availability);
//        Doctor doctor2 = new Doctor("Jane", "Doe", "Female", "Dermatologist", doctor2Availability);
//        Doctor doctor3 = new Doctor("Julia", "Davis", "Female", "General Practioner", doctor2Availability);
//        
//        // Create a list to store doctor objects
//        List<Doctor> doctorsList = new ArrayList<>();
//        doctorsList.add(doctor1);
//        doctorsList.add(doctor2);
//        doctorsList.add(doctor3);
//        
////        doctor1.displayDoctorInfo();
////        doctor2.displayDoctorInfo();		
        
        // Create the patient's profile
        
        //1. Welcome message
        System.out.println("Welcome to the MedEasy Doctor Appointment Booking System!");
        
        // Time lapse between statements
        try {
  			Thread.sleep(2500);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
        
        System.out.println("\nLet's start by getting a brief overview of who you are "
        		+ "and your reasons for booking an appointment today.\n");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        //2. Create the patient profile
         Patient patient = CreatePatientProfile.createPatient();
        
         
         // Time lapse between statements
         try {
   			Thread.sleep(1000);
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
       //3. Confirm that registration is complete
        System.out.println("Registration process complete!\n");
        // Time lapse between statements
        try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
        
        //4. Print the patient's details
        System.out.println(patient.getPatientInfo() + "\n");
        //System.out.println("Reason(s) for your visit: " + patient.getPatientSymptoms());
        
        // Time lapse between statements
        try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
        
        //5. Start the matching process:
        System.out.println("Matching you with doctors based on your symptoms...\n");
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        List<Doctor> matches = MatchDoctor.matchADoctor(patient, patient.getPatientSymptoms(), doctorsList);
        System.out.println("Thank you for using the MedEasy Doctor Appointment Booking System! See you next time!");
        
        //6. Book appointment
        //Doctor selectedDoctor = Booking.selectDoctor(matches);
        //System.out.println(selectedDoctor);
        //Booking.bookAppointment(selectedDoctor, patient);
        //Booking.scan.close();
      
        
	}

}
                                                                                                                                                             