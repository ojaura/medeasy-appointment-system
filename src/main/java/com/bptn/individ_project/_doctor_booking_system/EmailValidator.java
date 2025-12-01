package com.bptn.individ_project._doctor_booking_system;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
	
	public static boolean isValid(String email) {
		String expectedEmailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|ca|org)$";
		Pattern email_criteria = Pattern.compile(expectedEmailPattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = email_criteria.matcher(email);
		boolean isValid = matcher.find();
		
		return isValid;
		}
	}

