package edu.kcc.java.survey;

import java.util.ArrayList;

/**
 *
 * @author Wes Richardson
 */
public class SurveyDAOSqlServer implements ISurveyDAO {

    /**
     * 
     * @param survey
     * @return The new SurveyId
     */
    @Override
    public int createSurvey(Survey survey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateSurvey(Survey survey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Survey> retrieveSurveyByStudentId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteSurvey(Survey survey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteSurvey(int surveyId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Survey> retrieveAllSurveys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
