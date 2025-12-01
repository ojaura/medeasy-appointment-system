package com.bptn.individ_project._doctor_booking_system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormatDateTime {
	
    public static String formatDateTime(List<LocalDateTime> dates_and_times) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(" EEEE, MMMM d, yyyy 'at' h:mm a");
        StringBuilder formattedDateTime = new StringBuilder();
        
        // traverse through the list of dates and times and change the format
        for (LocalDateTime dateTime : dates_and_times) {
            if (formattedDateTime.length() > 0) {
                formattedDateTime.append("||"); // Add a comma separator for multiple slots
            }
            formattedDateTime.append(dateTime.format(format));
        }
        return formattedDateTime.toString();
    }
}