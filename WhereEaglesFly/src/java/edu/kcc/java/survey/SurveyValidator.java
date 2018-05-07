package edu.kcc.java.survey;

import java.time.LocalDate;

/**
 *
 * @author Jacob Slaubaugh
 */
public class SurveyValidator {

    /**
     * The minimum length of ID.
     */
    public static final int ID_MIN_LENGTH = 100000;

    /**
     * The maximum length of a survey code, in characters.
     */
    public static final int SURVEY_CODE_MAX_LENGTH = 100;

    /**
     * The maximum length of an employer id, in characters.
     */
    public static final int EMPLOYER_ID_MAX_LENGTH = 1000;

    /**
     * The maximum length of salary range, in characters.
     */
    public static final int SALARY_RANGE_MAX_LENGTH = 50;

    /**
     * Validates the supplied IDs. Cannot be less than ID_MIN_LENGTH.
     *
     * @param id
     */
    public static void validateID(int id) {
        if (id < ID_MIN_LENGTH) {
            throw new IllegalArgumentException("ID cannot be less than " + ID_MIN_LENGTH + ".");
        }
    }

    /**
     * Validates the supplied SurveyCode. Cannot be null. Cannot be longer than
     * SURVEY_CODE_MAX_LENGTH.
     *
     * @param surveyCode
     */
    public static void validateSurveyCode(String surveyCode) {
        if (null == surveyCode) {
            throw new IllegalArgumentException("SurveyCode cannot be null.");
        }
        if (surveyCode.isEmpty()){
            throw new IllegalArgumentException("SurveyCode cannot be empty.");
        }
        if (surveyCode.length() > SURVEY_CODE_MAX_LENGTH) {
            throw new IllegalArgumentException("SurveyCode cannot be longer than " + SURVEY_CODE_MAX_LENGTH + " charcters.");
        }
    }

    /**
     * Validates the supplied EmployerID. Cannot be null. Cannot be longer than
     * EMPLOYER_ID_MAX_LENGTH.
     *
     * @param employerID
     */
    public static void validateEmployerID(String employerID) {
        if (null == employerID) {
            throw new IllegalArgumentException("EmployerID cannot be null.");
        }
        if (employerID.isEmpty()){
            throw new IllegalArgumentException("EmployerID cannot be empty.");
        }
        if (employerID.length() > EMPLOYER_ID_MAX_LENGTH) {
            throw new IllegalArgumentException("EmployerID cannot be longer than " + EMPLOYER_ID_MAX_LENGTH + " charcters.");
        }
    }

    /**
     * Validates the supplied SalaryRange. Cannot be longer than
     * SALARY_RANGE_MAX_LENGTH.
     *
     * @param salary
     */
    public static void validateSalaryRange(String salary) {
        if (salary.length() > SALARY_RANGE_MAX_LENGTH) {
            throw new IllegalArgumentException("SalaryRange cannot be longer than " + SALARY_RANGE_MAX_LENGTH + " charcters.");
        }
    }

    /**
     * Validates the supplied DateTime. Cannot be null.
     *
     * @param dateTime
     */
    public static void validateDateTimeRecorded(LocalDate dateTime) {
        if (null == dateTime) {
            throw new IllegalArgumentException("DateTime cannot be null.");
        }
    }
}
