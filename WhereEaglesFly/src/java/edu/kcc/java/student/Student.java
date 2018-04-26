package edu.kcc.java.student;

import edu.kcc.java.survey.Survey;
import java.time.LocalDate;
import javax.validation.constraints.*;
/**
 *
 * @author Wesley Richardson
 */
public class Student {

    /**
     * The Id of the Student
     */
    @Min(100000)
    @NotNull
    private int studentId;

    /**
     * The student's first name
     */
    @Size(max=100)
    @NotNull
    private String firstName;

    /**
     * The student's last name
     */
    @Size(max=100)
    @NotNull
    private String lastName;

    /**
     * The student's email
     */
    @Size(max=240)
    @NotNull
    private String email;

    /**
     * The student's graduation date from Kirkwood
     */
    @NotNull
    private LocalDate graduationDate;

    /**
     * The student's phone number
     */
    @Max(15)
    @Null
    private String phoneNumber;

    /**
     * The program the student graduated in
     */
    @Size(max=100)
    @Null
    private String areaOfEmphasis;

    /**
     * Did the student have a degree before Kirkwood
     */
    @Null
    private boolean priorDegree;

    /**
     * Was the student under 24 while attending Kirkwood
     */
    @Null
    private boolean traditionalStudent;

    /**
     * The student's survey
     */
    private Survey survey;

    /**
     * The student's location
     */
    private Location location;

    /**
     * The full constructor
     *
     * @param studentId
     * @param firstName
     * @param lastName
     * @param email
     * @param graduationDate
     * @param phoneNumber
     * @param areaOfEmphasis
     * @param priorDegree
     * @param traditionalStudent
     * @param survey
     * @param location
     */
    public Student(int studentId, String firstName, String lastName, String email,
            LocalDate graduationDate, String phoneNumber, String areaOfEmphasis,
            boolean priorDegree, boolean traditionalStudent, Survey survey, Location location) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.graduationDate = graduationDate;
        this.phoneNumber = phoneNumber;
        this.areaOfEmphasis = areaOfEmphasis;
        this.priorDegree = priorDegree;
        this.traditionalStudent = traditionalStudent;
        this.survey = survey;
        this.location = location;
    }

    /**
     * The default constructor
     */
    public Student() {
        this.studentId = 0;
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.graduationDate = LocalDate.now();
        this.phoneNumber = "";
        this.areaOfEmphasis = "";
        this.priorDegree = false;
        this.traditionalStudent = true;
        this.survey = null;
        this.location = null;
    }

    /**
     * The Id of the Student
     *
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * The Id of the Student
     *
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * The student's first name
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The student's first name
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The student's last name
     *
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The student's last name
     *
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The student's email
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * The student's email
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The student's graduation date from Kirkwood
     *
     * @return the graduationDate
     */
    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    /**
     * The student's graduation date from Kirkwood
     *
     * @param graduationDate the graduationDate to set
     */
    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    /**
     * The student's phone number
     *
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The student's phone number
     *
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * The program the student graduated in
     *
     * @return the areaOfEmphasis
     */
    public String getAreaOfEmphasis() {
        return areaOfEmphasis;
    }

    /**
     * The program the student graduated in
     *
     * @param areaOfEmphasis the areaOfEmphasis to set
     */
    public void setAreaOfEmphasis(String areaOfEmphasis) {
        this.areaOfEmphasis = areaOfEmphasis;
    }

    /**
     * Did the student have a degree before Kirkwood
     *
     * @return the priorDegree
     */
    public boolean isPriorDegree() {
        return priorDegree;
    }

    /**
     * Did the student have a degree before Kirkwood
     *
     * @param priorDegree the priorDegree to set
     */
    public void setPriorDegree(boolean priorDegree) {
        this.priorDegree = priorDegree;
    }

    /**
     * Was the student under 24 while attending Kirkwood
     *
     * @return the traditionalStudent
     */
    public boolean isTraditionalStudent() {
        return traditionalStudent;
    }

    /**
     * Was the student under 24 while attending Kirkwood
     *
     * @param traditionalStudent the traditionalStudent to set
     */
    public void setTraditionalStudent(boolean traditionalStudent) {
        this.traditionalStudent = traditionalStudent;
    }

    /**
     * The student's survey
     *
     * @return the survey
     */
    public Survey getSurvey() {
        return survey;
    }

    /**
     * The student's survey
     *
     * @param survey the survey to set
     */
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    /**
     * The student's location
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * The student's location
     *
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }
}

