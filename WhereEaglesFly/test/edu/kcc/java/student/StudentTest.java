/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package edu.kcc.java.student;

import edu.kcc.java.student.Location;
import edu.kcc.java.student.Student;
import edu.kcc.java.survey.Survey;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author nh228u10
 */
public class StudentTest {
    
    public StudentTest() {

    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getStudentId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetIdAt100000() {
        System.out.println("setIdZero");
        int id = 100000;
        Student instance = new Student();
        instance.setStudentId(id);
    }
    
    @Test
    public void testSetIdLessThan100000()
    {
        System.out.println("setIdLessThan100000");
        int id = 99999;
        Student instance = new Student();
        int originalId = instance.getStudentId();
        try {
            instance.setStudentId(id);
            fail("Allowed to set ID less than 100000.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalId, instance.getStudentId());
        }
    }
    
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetFirstName100Chars() {
        System.out.println("setFirstName100Chars");
        String valueToSet = buildString(100);
        Student instance = new Student();
        instance.setFirstName(valueToSet);
    }
    
    @Test
    public void testSetFirstName101Chars()
    {
        System.out.println("setFirstName101Chars");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getFirstName();
        try {
            instance.setFirstName(valueToSet);
            fail("Allowed to first name with over 100 characters.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getFirstName());
        }
    }
    
    @Test
    public void testSetFirstNameEmpty()
    {
        System.out.println("setFirstNameEmpty");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getFirstName();
        try {
            instance.setFirstName(valueToSet);
            fail("Allowed to set empty first name");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getFirstName());
        }
    }
    
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetLastName100Chars() {
        System.out.println("setLastName100Chars");
        String valueToSet = buildString(100);
        Student instance = new Student();
        instance.setLastName(valueToSet);
    }
    
    @Test
    public void testSetLastName101Chars()
    {
        System.out.println("setLastName101Chars");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getLastName();
        try {
            instance.setFirstName(valueToSet);
            fail("Allowed to last name with over 100 characters.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getLastName());
        }
    }
    
    @Test
    public void testSetLastNameEmpty()
    {
        System.out.println("setLastNameEmpty");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getLastName();
        try {
            instance.setFirstName(valueToSet);
            fail("Allowed to set empty last name");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getLastName());
        }
    }
    
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetEmail254Chars() {
        System.out.println("setEmail254Chars");
        String valueToSet = buildString(254);
        Student instance = new Student();
        instance.setEmail(valueToSet);
    }
    
    @Test
    public void testSetEmail255Chars()
    {
        System.out.println("setEmail255Chars");
        String valueToSet = buildString(255);
        Student instance = new Student();
        String originalValue = instance.getEmail();
        try {
            instance.setEmail(valueToSet);
            fail("Allowed to email with over 254 characters.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getEmail());
        }
    }
    
    @Test
    public void testSetEmailEmpty()
    {
        System.out.println("setEmailEmpty");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getEmail();
        try {
            instance.setFirstName(valueToSet);
            fail("Allowed to set empty email");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getEmail());
        }
    }
    
    @Test
    public void testGetGraduationDate() {
        System.out.println("getGraduationDate");
        Student instance = new Student();
        LocalDate expResult = LocalDate.now();
        LocalDate result = instance.getGraduationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetGraduationDateCurrent() {
        System.out.println("setSetGraduationDateCurrent");
        LocalDate valueToSet = LocalDate.now();
        Student instance = new Student();
        instance.setGraduationDate(valueToSet);
    }
    
    @Test
    public void testSetGraduationDateFuture()
    {
        System.out.println("setGraduationDateFuture");
        LocalDate valueToSet = LocalDate.now().plusDays(1);
        Student instance = new Student();
        LocalDate originalValue = instance.getGraduationDate();
        try {
            instance.setGraduationDate(valueToSet);
            fail("Allowed to set graduation date in the future");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getGraduationDate());
        }
    }
    
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPhoneNumber15Chars() {
        System.out.println("setPhoneNumber15Chars");
        String valueToSet = buildString(15);
        Student instance = new Student();
        instance.setPhoneNumber(valueToSet);
    }
    
    @Test
    public void testSetPhoneNumber16Chars()
    {
        System.out.println("setPhoneNumber16Chars");
        String valueToSet = buildString(16);
        Student instance = new Student();
        String originalValue = instance.getPhoneNumber();
        try {
            instance.setPhoneNumber(valueToSet);
            fail("Allowed to set phone number with over 15 characters.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getPhoneNumber());
        }
    }
    
    @Test
    public void testSetPhoneNumberEmpty()
    {
        System.out.println("setPhoneNumberEmpty");
        String valueToSet = "";
        Student instance = new Student();
        instance.setPhoneNumber(valueToSet);
    }
    
    @Test
    public void testGetAreaOfEmphasis() {
        System.out.println("getAreaOfEmphasis");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getAreaOfEmphasis();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetAreaOfEmphasis100Chars() {
        System.out.println("setSetAreaofEmphasis100Chars");
        String valueToSet = buildString(100);
        Student instance = new Student();
        instance.setAreaOfEmphasis(valueToSet);
    }
    
    @Test
    public void testSetAreaOfEmphasis101Chars()
    {
        System.out.println("setAreaOfEmphasis101Chars");
        String valueToSet = buildString(101);
        Student instance = new Student();
        String originalValue = instance.getAreaOfEmphasis();
        try {
            instance.setAreaOfEmphasis(valueToSet);
            fail("Allowed to set phone number with over 15 characters.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalValue, instance.getAreaOfEmphasis());
        }
    }
    
    @Test
    public void testSetAreaOfEmpasisEmpty()
    {
        System.out.println("setAreaOfEmpasisEmpty");
        String valueToSet = "";
        Student instance = new Student();
        instance.setAreaOfEmphasis(valueToSet);
    }
    
    @Test
    public void testIsPriorDegree() {
        System.out.println("isPriorDegree");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isPriorDegree();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPriorDegree()
    {
        System.out.println("setPriorDegree");
        boolean valueToSet = true;
        Student instance = new Student();
        instance.setPriorDegree(valueToSet);
    }
    
    @Test
    public void testIsTraditionalStudent() {
        System.out.println("isTradtionalStudent");
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.isTraditionalStudent();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetTraditionalStudent()
    {
        System.out.println("setTraditionalStudent");
        boolean valueToSet = false;
        Student instance = new Student();
        instance.setTraditionalStudent(valueToSet);
    }
    
    @Test
    public void testGetSurvey() {
        System.out.println("getSurvey");
        Student instance = new Student();
        Survey expResult = null;
        Survey result = instance.getSurvey();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Student instance = new Student();
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Helper function to build long strings.
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
}
