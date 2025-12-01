package com.bptn.individ_project._doctor_booking_system;
import java.util.List;
import java.util.Scanner;

public class Booking {
	
	public static Doctor selectDoctor(List<Doctor> matches) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select the number of the doctor you would like to book with:");
        //Scanner scan = new Scanner(System.in);
		int selectedDoctorIndex = scan.nextInt() - 1;
		
        if (selectedDoctorIndex < 0 || selectedDoctorIndex >= matches.size()) {
            System.out.println("Invalid selection. Please try again.");
            return null;
        }
		
		Doctor selectedDoctor = matches.get(selectedDoctorIndex);
		System.out.println("You have selected Dr. " + selectedDoctor.getFirstName() + " " + selectedDoctor.getLastName() + ", " + selectedDoctor.getSpecialty());
		//scan.close();
		return selectedDoctor;
		
	}

	
}
