package edu.kcc.java.survey;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob Slaubaugh
 */
public class SurveyValidatorTest {

    public SurveyValidatorTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Build a String of the specified size.
     *
     * @param size
     * @return
     */
    private String buildString(int size) {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = 'X';
        }
        return new String(chars);
    }

    /**
     * Test of validateID method, of class SurveyValidator.
     */
    @Test
    public void testValidateIDGood() {
        System.out.println("validateIDGood");
        int id = 100001;
        SurveyValidator.validateID(id);
    }

    /**
     * Test of validateID method, of class SurveyValidator.
     */
    @Test
    public void testValidateIDBad() {
        System.out.println("validateIDBad");
        int id = 99999;
        try {
            SurveyValidator.validateID(id);
            fail("Accepted bad value for ID.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateSurveyCode method, of class SurveyValidator.
     */
    @Test
    public void testValidateSurveyCodeGood() {
        System.out.println("validateSurveyCodeGood");
        String surveyCode = buildString(20);
        SurveyValidator.validateSurveyCode(surveyCode);
    }

    /**
     * Test of validateSurveyCode method, of class SurveyValidator.
     */
    @Test
    public void testValidateSurveyCodeBad() {
        System.out.println("validateSurveyCodeBad");
        String surveyCode = buildString(100) + 1;
        try {
            SurveyValidator.validateSurveyCode(surveyCode);
            fail("Accepted bad value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateSurveyCode method, of class SurveyValidator.
     */
    @Test
    public void testValidateSurveyCodeNull() {
        System.out.println("validateSurveyCodeNull");
        String surveyCode = null;
        try {
            SurveyValidator.validateSurveyCode(surveyCode);
            fail("Accepted null value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateEmployerID method, of class SurveyValidator.
     */
    @Test
    public void testValidateEmployerIDGood() {
        System.out.println("validateEmployerIDGood");
        String employerID = buildString(10);
        SurveyValidator.validateEmployerID(employerID);
    }

    /**
     * Test of validateEmployerID method, of class SurveyValidator.
     */
    @Test
    public void testValidateEmployerIDTooLong() {
        System.out.println("validateEmployerIDBad");
        String employerID = buildString(1000) + 1;
        try {
            SurveyValidator.validateEmployerID(employerID);
            fail("Accepted a bad value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of validateEmployerID method, of class SurveyValidator.
     */
    @Test
    public void testValidateEmployerIDEmpty() {
        System.out.println("validateEmployerIDEmpty");
        String employerID = "";
        try {
            SurveyValidator.validateEmployerID(employerID);
            fail("Accepted a bad value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateEmployerID method, of class SurveyValidator.
     */
    @Test
    public void testValidateEmployerIDNull() {
        System.out.println("validateEmployerIDNull");
        String employerID = null;
        try {
            SurveyValidator.validateEmployerID(employerID);
            fail("Accepted a null value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateSalaryRange method, of class SurveyValidator.
     */
    @Test
    public void testValidateSalaryRangeGood() {
        System.out.println("validateSalaryRange");
        String salary = buildString(5);
        SurveyValidator.validateSalaryRange(salary);
    }

    /**
     * Test of validateSalaryRange method, of class SurveyValidator.
     */
    @Test
    public void testValidateSalaryRangeBad() {
        System.out.println("validateSalaryRange");
        String salary = buildString(50) + 1;
        try {
            SurveyValidator.validateSalaryRange(salary);
            fail("Accepted a null value for SurveyCode.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of validateDateTimeRecorded method, of class SurveyValidator.
     */
    @Test
    public void testValidateDateTimeRecordedGood() {
        System.out.println("validateDateTimeRecordedGood");
        LocalDate dateTime = LocalDate.now();
        SurveyValidator.validateDateTimeRecorded(dateTime);
    }

    /**
     * Test of validateDateTimeRecorded method, of class SurveyValidator.
     */
    @Test
    public void testValidateDateTimeRecordedNull() {
        System.out.println("validateDateTimeRecordedNull");
        LocalDate dateTime = null;
        try {
            SurveyValidator.validateDateTimeRecorded(dateTime);
            fail("Accepted a null value for SurveyCode.");
        } catch (IllegalArgumentException iae) {

        }

    }
}
