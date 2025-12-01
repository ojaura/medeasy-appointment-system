package com.bptn.individ_project._doctor_booking_system;

public class Person {
	
	//Declare person attributes
	private String firstName;
	private String lastName;
	private String gender;
	//private String language;
	
	//Create a constructor
	public Person(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	                            
	//Create getter methods
	public String getLastName() {
		return lastName;                                                                                                                                                          
	}

	public String getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}
	
	//Create setter methods
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
