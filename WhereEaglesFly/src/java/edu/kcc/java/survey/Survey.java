package edu.kcc.java.survey;

import javax.validation.constraints.*;

/**
 *
 * @author Wesley Richardson
 */
public class Survey {

    /**
     * The unique code from the student to take the survey
     */
    @Size(max=100)
    @NotNull
    private String surveyCode;
    
    /**
     * The name of the employer the student works for
     */
    @Size(max=1000)
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
    @Size(max=50)
    private String salaryRange;   

    /**
     * The full constructor
     * @param surveyCode
     * @param EmployerId
     * @param educationAfterKirkwood
     * @param salaryRange 
     */
    public Survey(String surveyCode, String EmployerId, boolean educationAfterKirkwood, String salaryRange) {
        this.surveyCode = surveyCode;
        this.EmployerId = EmployerId;
        this.educationAfterKirkwood = educationAfterKirkwood;
        this.salaryRange = salaryRange;
    }

    /**
     * The default constructor
     */
    public Survey() {
    }
    
    /**
     * The unique code from the student to take the survey
     * @return the surveyCode
     */
    public String getSurveyCode() {
        return surveyCode;
    }

    /**
     * The unique code from the student to take the survey
     * @param surveyCode the surveyCode to set
     */
    public void setSurveyCode(String surveyCode) {
        this.surveyCode = surveyCode;
    }

    /**
     * The name of the employer the student works for
     * @return the EmployerId
     */
    public String getEmployerId() {
        return EmployerId;
    }

    /**
     * The name of the employer the student works for
     * @param EmployerId the EmployerId to set
     */
    public void setEmployerId(String EmployerId) {
        this.EmployerId = EmployerId;
    }

    /**
     * Did the student continue their education
     * @return the educationAfterKirkwood
     */
    public boolean isEducationAfterKirkwood() {
        return educationAfterKirkwood;
    }

    /**
     * Did the student continue their education
     * @param educationAfterKirkwood the educationAfterKirkwood to set
     */
    public void setEducationAfterKirkwood(boolean educationAfterKirkwood) {
        this.educationAfterKirkwood = educationAfterKirkwood;
    }

    /**
     * The salary range the student makes
     * @return the salaryRange
     */
    public String getSalaryRange() {
        return salaryRange;
    }

    /**
     * The salary range the student makes
     * @param salaryRange the salaryRange to set
     */
    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }
    
}

