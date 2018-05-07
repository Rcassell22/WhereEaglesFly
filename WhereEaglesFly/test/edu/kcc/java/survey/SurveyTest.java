package edu.kcc.java.survey;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob Slaubaugh
 */
public class SurveyTest {

    public SurveyTest() {
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
     * Test of getSurveyCode method, of class Survey.
     */
    @Test
    public void testGetSurveyCode() {
        System.out.println("getSurveyCode");
        Survey instance = new Survey();
        String expResult = null;
        String result = instance.getSurveyCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSurveyCode method, of class Survey.
     */
    @Test
    public void testSetSurveyCodeGood() {
        System.out.println("setSurveyCodeGood");
        String surveyCode = buildString(100);
        Survey instance = new Survey();
        instance.setSurveyCode(surveyCode);
    }
    
    /**
     * Test of setSurveyCode method, of class Survey.
     */
    @Test
    public void testSetSurveyCodeNull() {
        System.out.println("setSurveyCodeNull");
        String surveyCode = null;
        Survey instance = new Survey();
        try {
            instance.setSurveyCode(surveyCode);
            fail("Allowed to set survey code null.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of setSurveyCode method, of class Survey.
     */
    @Test
    public void testSetSurveyCodeEmpty() {
        System.out.println("setSurveyCodeEmpty");
        String surveyCode = "";
        Survey instance = new Survey();
        try {
            instance.setSurveyCode(surveyCode);
            fail("Allowed to set survey code empty.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of setSurveyCode method, of class Survey.
     */
    @Test
    public void testSetSurveyCodeTooLong() {
        System.out.println("setSurveyCodeTooLong");
        String surveyCode = buildString(100)+1;
        Survey instance = new Survey();
        try {
            instance.setSurveyCode(surveyCode);
            fail("Allowed to set survey code null.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of getEmployerId method, of class Survey.
     */
    @Test
    public void testGetEmployerId() {
        System.out.println("getEmployerId");
        Survey instance = new Survey();
        String expResult = null;
        String result = instance.getEmployerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployerId method, of class Survey.
     */
    @Test
    public void testSetEmployerIdGood() {
        System.out.println("setEmployerIdGood");
        String EmployerId = buildString(100);
        Survey instance = new Survey();
        instance.setEmployerId(EmployerId);
    }
    
    /**
     * Test of setEmployerId method, of class Survey.
     */
    @Test
    public void testSetEmployerIdTooLong() {
        System.out.println("setEmployerIdTooLong");
        String EmployerId = buildString(1000)+1;
        Survey instance = new Survey();
        String original = instance.getEmployerId();
        try {
            instance.setEmployerId(EmployerId);
            fail("Allowed to set employee id too long.");
        } catch (IllegalArgumentException iae) {
            assertEquals(original, instance.getEmployerId());
        }
    }
    
    /**
     * Test of setEmployerId method, of class Survey.
     */
    @Test
    public void testSetEmployerIdEmpty() {
        System.out.println("setEmployerIdEmpty");
        String EmployerId = "";
        Survey instance = new Survey();
        try {
            instance.setEmployerId(EmployerId);
            fail("Allowed to set employee id empty.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of setEmployerId method, of class Survey.
     */
    @Test
    public void testSetEmployerIdNull() {
        System.out.println("setEmployerIdNull");
        String EmployerId = null;
        Survey instance = new Survey();
        try {
            instance.setEmployerId(EmployerId);
            fail("Allowed to set employee id null.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of isEducationAfterKirkwood method, of class Survey.
     */
    @Test
    public void testIsEducationAfterKirkwood() {
        System.out.println("isEducationAfterKirkwood");
        Survey instance = new Survey();
        boolean expResult = false;
        boolean result = instance.isEducationAfterKirkwood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEducationAfterKirkwood method, of class Survey.
     */
    @Test
    public void testSetEducationAfterKirkwood() {
        System.out.println("setEducationAfterKirkwood");
        boolean educationAfterKirkwood = false;
        Survey instance = new Survey();
        instance.setEducationAfterKirkwood(educationAfterKirkwood);
    }

    /**
     * Test of getSalaryRange method, of class Survey.
     */
    @Test
    public void testGetSalaryRange() {
        System.out.println("getSalaryRange");
        Survey instance = new Survey();
        String expResult = null;
        String result = instance.getSalaryRange();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSalaryRange method, of class Survey.
     */
    @Test
    public void testSetSalaryRangeGood() {
        System.out.println("setSalaryRangeGood");
        String salaryRange = buildString(50);
        Survey instance = new Survey();
        instance.setSalaryRange(salaryRange);
    }
    
    /**
     * Test of setSalaryRange method, of class Survey.
     */
    @Test
    public void testSetSalaryRangeTooLong() {
        System.out.println("setSalaryRangeTooLong");
        String salaryRange = buildString(50)+1;
        Survey instance = new Survey();
        try {
            instance.setSalaryRange(salaryRange);
            fail("Allowed to set salary range too long.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of getSurveyID method, of class Survey.
     */
    @Test
    public void testGetSurveyID() {
        System.out.println("getSurveyID");
        Survey instance = new Survey();
        int expResult = 0;
        int result = instance.getSurveyID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSurveyID method, of class Survey.
     */
    @Test
    public void testSetSurveyIDGood() {
        System.out.println("setSurveyIDGood");
        int surveyID = 100000;
        Survey instance = new Survey();
        instance.setSurveyID(surveyID);
    }
    
    /**
     * Test of setSurveyID method, of class Survey.
     */
    @Test
    public void testSetSurveyIDZero() {
        System.out.println("setSurveyIDZero");
        int surveyID = 0;
        Survey instance = new Survey();
        try {
            instance.setSurveyID(surveyID);
            fail("Allowed to set survey id zero.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of setSurveyID method, of class Survey.
     */
    @Test
    public void testSetSurveyIDNegative() {
        System.out.println("setSurveyIDNegative");
        int surveyID = -1;
        Survey instance = new Survey();
        try {
            instance.setSurveyID(surveyID);
            fail("Allowed to set survey id negative.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of getStudentID method, of class Survey.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Survey instance = new Survey();
        int expResult = 0;
        int result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentID method, of class Survey.
     */
    @Test
    public void testSetStudentIDGood() {
        System.out.println("setStudentIDGood");
        int studentID = 100000;
        Survey instance = new Survey();
        instance.setStudentID(studentID);
    }
    
    /**
     * Test of setStudentID method, of class Survey.
     */
    @Test
    public void testSetStudentIDZero() {
        System.out.println("setStudentIDZero");
        int studentID = 0;
        Survey instance = new Survey();
        try {
            instance.setStudentID(studentID);
            fail("Allowed to set student id zero.");
        } catch (IllegalArgumentException iae) {
        }
    }
    
    /**
     * Test of setStudentID method, of class Survey.
     */
    @Test
    public void testSetStudentIDNegative() {
        System.out.println("setStudentIDNegative");
        int studentID = -1;
        Survey instance = new Survey();
        try {
            instance.setStudentID(studentID);
            fail("Allowed to set student id negative.");
        } catch (IllegalArgumentException iae) {
        }
    }

    /**
     * Test of getDateTimeRecorded method, of class Survey.
     */
    @Test
    public void testGetDateTimeRecorded() {
        System.out.println("getDateTimeRecorded");
        Survey instance = new Survey();
        LocalDate expResult = null;
        LocalDate result = instance.getDateTimeRecorded();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTimeRecorded method, of class Survey.
     */
    @Test
    public void testSetDateTimeRecordedGood() {
        System.out.println("setDateTimeRecordedGood");
        LocalDate dateTimeRecorded = LocalDate.now();
        Survey instance = new Survey();
        instance.setDateTimeRecorded(dateTimeRecorded);
    }
    
    /**
     * Test of setDateTimeRecorded method, of class Survey.
     */
    @Test
    public void testSetDateTimeRecordedNull() {
        System.out.println("setDateTimeRecordedNull");
        LocalDate dateTimeRecorded = null;
        Survey instance = new Survey();
        try {
            instance.setDateTimeRecorded(dateTimeRecorded);
            fail("Allowed to set local date null.");
        } catch (IllegalArgumentException iae) {
        }
    }
}
