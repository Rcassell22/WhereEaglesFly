package edu.kcc.java.student;

import java.time.LocalDate;

/**
 *
 * @author Brady Feller
 */
public class StudentValidator {

    private static final int STUDENT_ID_MAX_VALUE = 100000;

    private static final int MAX_NAME_LENGTH = 100;

    private static final int MAX_EMAIL_LENGTH = 254;

    private static final int MAX_PHONE_NUMBER_LENGTH = 15;

    private static final int MAX_AREA_OF_EMPHASIS_LENGTH = 100;

    public void validateStudentId(int studentId) {
        if (studentId < STUDENT_ID_MAX_VALUE) {
            throw new IllegalArgumentException("Error: Student Id cannot be less than 100000");
        }
    }

    public void validateName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Error: First Name cannot be empty");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("Error: Names cannot be over 100 characters");
        }

    }

    public void validateEmail(String email) {
        if (email.length() > MAX_EMAIL_LENGTH) {
            throw new IllegalArgumentException("Error: Email cannot be over 254 characters");
        }
    }

    public void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > MAX_PHONE_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Error: Phone number cannot be over 15 characters");
        }
    }

    public void validateAreaOfEmphasis(String areaOfEmphasis) {
        if(areaOfEmphasis.length() > MAX_AREA_OF_EMPHASIS_LENGTH){
            throw new IllegalArgumentException("Error: Area of emphasis cannot be over 100 characters");
        }
    }
    
    public void validateGraduationDate(LocalDate graduationDate)
    {
        if(graduationDate.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Error: Graduation date cannot be in the future");
        }
    }
}
