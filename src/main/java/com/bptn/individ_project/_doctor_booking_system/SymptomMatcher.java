package com.bptn.individ_project._doctor_booking_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomMatcher { //Matches common symptoms with their respective specialties
	
	// Declare a variable to store the association of symptoms and doctor specialties
	private static Map<String, String> symptomToSpecialty = new HashMap<>();
	
	// Declare a variable to store common symptoms with associated IDs
	private static Map<Integer, String> commonSymptoms = new HashMap<>();
	
	//Static Block to initialize the hashmaps
	static {
		// Initialize symptom to specialty mapping
		symptomToSpecialty.put("Fever", "Primary Care");
		symptomToSpecialty.put("Headache/Migraine", "Neurologist");
		symptomToSpecialty.put("Skin Issues", "Dermatologist");
		symptomToSpecialty.put("Body Pain", "Orthopedist");
		symptomToSpecialty.put("Sore Throat", "ENT Specialist");
		symptomToSpecialty.put("Injury", "Orthopedist");
		symptomToSpecialty.put("Eye Problems", "Opthomologist");
		symptomToSpecialty.put("High Blood Pressure", "Cardiologist");
		symptomToSpecialty.put("Digestive Issues", "Gastroenterologist");
		symptomToSpecialty.put("Mental Health Concerns", "Psychologist");
		symptomToSpecialty.put("Female Reproductive Issues", "Gynecologist");
		symptomToSpecialty.put("Men's Health Issues", "Urologist");
		symptomToSpecialty.put("Other", "General Practioner");
		
		// Initialize common symptoms with associated IDs
        commonSymptoms.put(1, "Fever");
        commonSymptoms.put(2, "Headache/Migraine");
        commonSymptoms.put(3, "Skin Issues");
        commonSymptoms.put(4, "Body Pain");
        commonSymptoms.put(5, "High Blood Pressure");
        commonSymptoms.put(6, "Sore Throat");
        commonSymptoms.put(7, "Injury");
        commonSymptoms.put(8, "Eye Problems");
        commonSymptoms.put(9, "Digestive Issues");
        commonSymptoms.put(10, "Other");
	}
	
	public static void displayCommonSymptoms() {
		for(Map.Entry<Integer, String> entry : commonSymptoms.entrySet()) {
			if(entry.getKey() > 0) {
				System.out.println(entry.getKey() + "." + entry.getValue());
			}
		}
	}
	//getter method for common symptoms
	public static Map<Integer, String> getCommonSymptoms() {
		return commonSymptoms;
	}
	
	// method to match a given list of symptoms to specialists-returns a list of doctors that specialize in the patient's symptoms
	public static List<String> symptomMatchSpecialties(List<String> patientSymptoms) {
		// Create an array list to store the specialties that match the patient's symptoms
		List<String> symptomMatchedSpecialties = new ArrayList<>();
		
		//traverse through the patientSymptoms and add matching specialties to the array list
		for(String symptom : patientSymptoms) {
			// Check if the symptom exists in the database
			if (symptomToSpecialty.get(symptom) != null) {
				//Add the corresponding specialty
				symptomMatchedSpecialties.add(symptomToSpecialty.get(symptom));
			}
		}
		//System.out.println(symptomMatchedSpecialties);
		return symptomMatchedSpecialties;
	}
	
	// method to filter and find doctors that match the required specialties
	public static List<Doctor> findSpecialists(List<String> requiredSpecialists, List<Doctor> doctorsList) {
		List<Doctor> matchedSpecialists = new ArrayList<>();
		//Loop through the required specialists
		for(String requiredSpecialist : requiredSpecialists) {
			// Inner loop to traverse the doctor's list to find a match with the required specialty
			for (Doctor doctor : doctorsList) {
				if (doctor.getSpecialty().equals(requiredSpecialist)) {
					matchedSpecialists.add(doctor);
				}
			}
		}
		//System.out.println(matchedSpecialists);
		return matchedSpecialists;
	}
	
	// method to display the specialists that match the patient's symptoms
	public static void displayMatches(List<Doctor> symptomMatches) {
		//System.out.println("Here are the doctors that specialize in your symptoms: \n");
		
		for (Doctor doctor : symptomMatches) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(symptomMatches.indexOf(doctor)+ 1 + ") ");
			doctor.displayDoctorInfo();
		}
	}
}