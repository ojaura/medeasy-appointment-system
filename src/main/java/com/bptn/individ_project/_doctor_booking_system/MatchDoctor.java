package com.bptn.individ_project._doctor_booking_system;

import java.util.List;

public class MatchDoctor {
	public static List<Doctor> matchADoctor(Patient patient, List<String> patientSymptoms, List<Doctor> doctorsList) {
		List<String> requiredSpecialists = SymptomMatcher.symptomMatchSpecialties(patientSymptoms);
		
		// Search for doctors that match the required specialties based on the patient's symptoms
		List<Doctor> matchedSpecialists = SymptomMatcher.findSpecialists(requiredSpecialists, doctorsList);
//		
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//1. Display the list of doctors that specialize in the patient's symptoms
		SymptomMatcher.displayMatches(matchedSpecialists);
		
		//2. Ask the patient if they want to filter their search. If yes, then filter. If no, then leave the list unaltered
		List<Doctor> filteredMatches = FilterDoctor.filterDoctor(matchedSpecialists);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("Here are your filtered matches: ");
		SymptomMatcher.displayMatches(filteredMatches);
		return filteredMatches;
		
		//3. Prompt patient to select a doctor
		//Booking.bookAppointment(Booking.selectDoctor(filteredMatches), patient);
		
	}
}
