package com.bptn.individ_project._doctor_booking_system;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FilterDoctor {
	
	public static List<Doctor> filterDoctor(List<Doctor> matchedDoctors) {
		
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		
		// Ask patient if they want to filter the doctors
		System.out.println("Do you want to filter your doctor search based on"
				+ "\ntheir gender? Type yes or no.");
		// Collect user input
		String choice = scan.nextLine();
		
		System.out.println(choice);
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println("Please choose a preferred gender: Type F for female or M for Male.");
			choice = scan.nextLine();
			
			System.out.println("Filtering your search...");
			
			// Create an iterator to loop through the list of matched doctors safely (avoid concurrent modification)
	        Iterator<Doctor> iterator = matchedDoctors.iterator();
	
		// Remove male doctors from the list
			if (choice.equalsIgnoreCase("F")) {
				while(iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if(!(doctor.getGender().equals("Female"))) {
						iterator.remove();
					}
				}
				System.out.println("Here are the female doctors that specialize in your symptoms: \n");
			}
			
			// Remove female doctors from the list
			else {
				while(iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if(!(doctor.getGender().equals("Male"))) {
						iterator.remove();
					}
				}
				System.out.println("Here are the male doctors that specialize in your symptoms: \n");
			}
		}
		scan.close();
		return matchedDoctors;
		
	}
}
