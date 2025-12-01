package com.bptn.individ_project._doctor_booking_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CreatePatientProfile {
	
	static Scanner scan = new Scanner(System.in);
	
	// create methods to collect details from the patient
	public static String patientFirstName() {
		System.out.println("Please enter your first name: ");
		String patientFirstName = scan.nextLine();
		return patientFirstName;
	}
	
	public static String patientLastName() {
		System.out.println("Please enter your last name: ");
		String patientLastName = scan.nextLine();
		return patientLastName;
	}
	
	public static String patientGender() {
		String patientGender = "";
        while (true) {
            try {
                System.out.println("Please enter your gender (M/F): ");
                patientGender = scan.nextLine().toUpperCase();
                if (patientGender.equals("M") || patientGender.equals("F")) {
                    break; // Valid input
                } else {
                    throw new IllegalArgumentException("Invalid input. Please enter 'M' for Male or 'F' for Female.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
		return patientGender;
	}
	
	public static String patientEmail() {
		String patientEmail = "";
        while (true) {
            try {
                System.out.println("Please enter a valid email address: ");
                patientEmail = scan.nextLine();
                if (EmailValidator.isValid(patientEmail)) {
                    break; // Valid input
                } else {
                    throw new IllegalArgumentException("Invalid email format. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
		return patientEmail;
	}
	
	
	public static List<String> getPatientSymptoms(Map<Integer, String> commonSymptoms) {
		List<String> patientSymptoms = new ArrayList<>();
		 // Time lapse between statements
        try {
  			Thread.sleep(100);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
		
		System.out.println("You will now be shown a list of symptoms to choose from. You can select up to a maximum of 3 symptoms that you have.\n");
		 // Time lapse between statements
        try {
  			Thread.sleep(7000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
		
        // Display the symptoms to choose from
		SymptomMatcher.displayCommonSymptoms();
		
		 // Time lapse between statements
        try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("\nPlease choose from the list above and enter a symptom or type 0 if you have none: ");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			}
			else {
				patientSymptoms.add(commonSymptoms.get(choice));
			}
		}
		return patientSymptoms;
	}
	
	public static long patientHealthCardNum() {
		long patientHealthCard = 0;
		while (true) {
            try {
                System.out.println("Please enter your 5 digit health card number: ");
                if (scan.hasNextLong()) {
                    patientHealthCard = scan.nextLong();
                    if (String.valueOf(patientHealthCard).length() == 5) {
                        break; // Valid input
                    } else {
                        throw new IllegalArgumentException("Health card number must be 5 digits long. Please try again.");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid input. Please enter a numeric value.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scan.next(); // Clear the invalid input
            }
        }
		
		return patientHealthCard;
	}
	
	//scan.close();
	public static Patient createPatient() {
		
		//Initialize the patient's attributes with user input
		//Get the patient's first name
		String firstName = CreatePatientProfile.patientFirstName();
		//Get the patient's last name
		String lastName = CreatePatientProfile.patientLastName();
		//Get the patient's gender
		String gender = CreatePatientProfile.patientGender();
		//Get the patient's email address
		String emailAddress = CreatePatientProfile.patientEmail();
		//Get the patient's symptoms
		//Get the patient's healthCardNum
		long healthCardNum = CreatePatientProfile.patientHealthCardNum();
		// Time lapse between statements
        try {
  			Thread.sleep(2500);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
		
		//Get the patient's symptoms
		List <String> patientSymptoms = CreatePatientProfile.getPatientSymptoms(SymptomMatcher.getCommonSymptoms());
		
		
		//Create the patient object
		Patient patient = new Patient(firstName, lastName, gender, emailAddress, patientSymptoms, healthCardNum);
		
		//Return the patient object
		return patient;
	}
}
