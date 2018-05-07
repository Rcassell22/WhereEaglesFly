package edu.kcc.java.survey;

import java.time.LocalDate;
import javax.validation.constraints.*;

/**
 *
 * @author Wesley Richardson
 */
public class Survey {

    /**
     * The Id of the Survey
     */
    @Min(1000000)
    @NotNull
    private int surveyID;

    /**
     * The Id of the Student
     */
    @Min(1000000)
    @NotNull
    private int studentID;

    /**
     * The unique code from the student to take the survey
     */
    @Size(max = 100)
    @NotNull
    private String surveyCode;

    /**
     * The name of the employer the student works for
     */
    @Size(max = 1000)
    @NotNull
    private String EmployerId;

    /**
     * Did the student continue their education
     */
    @Null
    private boolean educationAfterKirkwood;

    /**
     * The salary range the student makes
     */
    @Size(max = 50)
    private String salaryRange;

    /**
     * Date the survey was recorded
     */
    @NotNull
    private LocalDate dateTimeRecorded;

    /**
     * Full Constructor
     *
     * @param surveyID
     * @param studentID
     * @param surveyCode
     * @param EmployerId
     * @param educationAfterKirkwood
     * @param salaryRange
     * @param dateTimeRecorded
     */
    public Survey(int surveyID, int studentID, String surveyCode, String EmployerId, boolean educationAfterKirkwood, String salaryRange, LocalDate dateTimeRecorded) {
        SurveyValidator.validateID(surveyID);
        SurveyValidator.validateID(studentID);
        SurveyValidator.validateSurveyCode(surveyCode);
        SurveyValidator.validateEmployerID(EmployerId);
        SurveyValidator.validateSalaryRange(salaryRange);
        SurveyValidator.validateDateTimeRecorded(dateTimeRecorded);
        this.surveyID = surveyID;
        this.studentID = studentID;
        this.surveyCode = surveyCode;
        this.EmployerId = EmployerId;
        this.educationAfterKirkwood = educationAfterKirkwood;
        this.salaryRange = salaryRange;
        this.dateTimeRecorded = dateTimeRecorded;
    }

    /**
     * The default constructor
     */
    public Survey() {
    }

    /**
     * The unique code from the student to take the survey
     *
     * @return the surveyCode
     */
    public String getSurveyCode() {
        return surveyCode;
    }

    /**
     * The unique code from the student to take the survey
     *
     * @param surveyCode the surveyCode to set
     */
    public void setSurveyCode(String surveyCode) {
        SurveyValidator.validateSurveyCode(surveyCode);
        this.surveyCode = surveyCode;
    }

    /**
     * The name of the employer the student works for
     *
     * @return the EmployerId
     */
    public String getEmployerId() {
        return EmployerId;
    }

    /**
     * The name of the employer the student works for
     *
     * @param EmployerId the EmployerId to set
     */
    public void setEmployerId(String EmployerId) {
        SurveyValidator.validateEmployerID(EmployerId);
        this.EmployerId = EmployerId;
    }

    /**
     * Did the student continue their education
     *
     * @return the educationAfterKirkwood
     */
    public boolean isEducationAfterKirkwood() {
        return educationAfterKirkwood;
    }

    /**
     * Did the student continue their education
     *
     * @param educationAfterKirkwood the educationAfterKirkwood to set
     */
    public void setEducationAfterKirkwood(boolean educationAfterKirkwood) {
        this.educationAfterKirkwood = educationAfterKirkwood;
    }

    /**
     * The salary range the student makes
     *
     * @return the salaryRange
     */
    public String getSalaryRange() {
        return salaryRange;
    }

    /**
     * The salary range the student makes
     *
     * @param salaryRange the salaryRange to set
     */
    public void setSalaryRange(String salaryRange) {
        SurveyValidator.validateSalaryRange(salaryRange);
        this.salaryRange = salaryRange;
    }

    /**
     * The Id of the Survey
     *
     * @return the surveyID
     */
    public int getSurveyID() {
        return surveyID;
    }

    /**
     * The Id of the Survey
     *
     * @param surveyID the surveyID to set
     */
    public void setSurveyID(int surveyID) {
        SurveyValidator.validateID(surveyID);
        this.surveyID = surveyID;
    }

    /**
     * The Id of the Student
     *
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * The Id of the Student
     *
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        SurveyValidator.validateID(studentID);
        this.studentID = studentID;
    }

    /**
     * Date the survey was recorded
     *
     * @return the dateTimeRecorded
     */
    public LocalDate getDateTimeRecorded() {
        return dateTimeRecorded;
    }

    /**
     * Date the survey was recorded
     *
     * @param dateTimeRecorded the dateTimeRecorded to set
     */
    public void setDateTimeRecorded(LocalDate dateTimeRecorded) {
        SurveyValidator.validateDateTimeRecorded(dateTimeRecorded);
        this.dateTimeRecorded = dateTimeRecorded;
    }

}
