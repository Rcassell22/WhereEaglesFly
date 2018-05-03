package edu.kcc.java.survey;

import java.util.ArrayList;

/**
 *
 * @author Wes Richardson
 */
public interface ISurveyDAO {
    
    /**
     * 
     * @param survey
     * @return The new SurveyId
     */
    int createSurvey(Survey survey);
    
    int updateSurvey(Survey survey);
    
    ArrayList<Survey> retrieveSurveyByStudentId(int id);
    
    int deleteSurvey(Survey survey);
    
    int deleteSurvey(int surveyId);
    
    ArrayList<Survey> retrieveAllSurveys(); 
    
}
