# 🩺 MedEasy Appointment Booking System

A Java OOP scheduling application for matching patients to the right doctors and managing clinic appointments.

📌 Overview

MedEasy is a console-based medical appointment booking system built using Object-Oriented Programming (OOP) in Java.
It allows patients to register, enter their symptoms, and receive a list of available doctors who specialize in their condition, along with their appointment availability.
The system also supports doctor schedule management, patient profile creation, and core administrative functions.

🧩 Key Features

    •    Patient Registration:
Create and store patient profiles with validated inputs.

    •    Symptom-Based Matching:
     Patients enter their symptoms → system uses simple rule-based logic to match them with appropriate doctors.

    •    Doctor Availability Management:   
          Add, update, and retrieve available appointment times.

    •    Appointment Booking System:
Book and view appointments.

    •    Custom Validators:
Email, date/time formats, and input checks implemented using dedicated validator classes.

    •    Clean OOP Design:
Abstraction, encapsulation, modular classes, and separation of concerns.

🛠️ Technologies Used
    •    Java (OOP)
    •    Maven
    •    Collections Framework
    •    (JUnit if applicable)

🧱 Project Structure

src/
 └── main/java/com/.../doctor_booking_system/
 
      ├── Appointment.java
      
      ├── Availability.java
      
      ├── Booking.java
      
      ├── Clinic.java
      
      ├── CreatePatientProfile.java
      
      ├── Doctor.java
      
      ├── EmailValidator.java
      
      ├── FormatDateTime.java
      
      ├── MatchDoctor.java
      
      ├── MatchDoctorByTime.java
      
      ├── Patient.java
      
      ├── Person.java
      
      └── SymptomMatcher.java

🎯 What I Learned

    •    Designing modular software using object-oriented principles
    
    •    Handling program state across multiple interacting classes
    
    •    Building input validation logic and rule-based matching
    
    •    Managing schedules & booking logic
    
    •    Structuring projects using Maven
    
    •    Applying clean coding practices

🚀 How to Run

    1.    Clone the repository
    
    2.    Open in IntelliJ / VS Code / Eclipse
    
    3.    Build with Maven
    
    4.    Run App.java
    
🔮 Future Improvements

Here are enhancements planned for the next version of MedEasy:

 • Web Interface: 
    Convert to a Spring Boot web application.
    
 • More Advanced Symptom Matching: 
Replace rule-based matching with a simple ML classifier or NLP-based symptom parser.

 •    Secure User Authentication:
Add password hashing, encrypted storage, and login sessions for patient and doctor accounts.

 •    Appointment Reminders & Notifications:
Email or SMS reminders for upcoming appointments

 •    Doctor Profile Enhancements:
Include doctor ratings, specialties, and clinic locations

 •    Calendar View for Availability:
Allow patients to see a visual weekly schedule to book more easily.
