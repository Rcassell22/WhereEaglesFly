package edu.kcc.java.survey;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Wes Richardson
 */
public class SurveyDAOMock implements ISurveyDAO{

    private LocalDate now;
    private ArrayList<Survey> surveyList;
    private final int MIN_ID = 1000000;
    
    public SurveyDAOMock() {
    now = LocalDate.now();
    surveyList = new ArrayList<>();
    
    Survey survey1 = new Survey(1000000,1000000,"abcde","Programing Inc",false,"40,000-60,000",now);
    Survey survey2 = new Survey(1000001,1000001,"fghij","Coding Co",true,"70,000-80,000",now);
    Survey survey3 = new Survey(1000002,1000002,"klmno","Code 'R' Us",false,"40,000-60,000",now);
    Survey survey4 = new Survey(1000003,1000003,"pqrst","Coding Co",true,"70,000-80,000",now);
    Survey survey5 = new Survey(1000004,1000004,"uvwxy","Coding Co",false,"40,000-60,000",now);
    surveyList.add(survey1);
    surveyList.add(survey2);
    surveyList.add(survey3);
    surveyList.add(survey4);
    surveyList.add(survey5);
    }    

    /**
     * 
     * @param survey
     * @return The new SurveyId
     */
    @Override
    public int createSurvey(Survey survey) {
        int id = MIN_ID +  surveyList.size();
        survey.setSurveyID(id);
        surveyList.add(survey);
        return id;
    }

    @Override
    public int updateSurvey(Survey survey) {
        int rows = 0;
        
        for (Survey survey1 : surveyList) {
            if(survey.getSurveyID() == survey1.getSurveyID()) {
                surveyList.remove(survey1);
                surveyList.add(survey);
                rows++;
            }
        }        
        return rows;
    }

    @Override
    public ArrayList<Survey> retrieveSurveyByStudentId(int id) {
        ArrayList surveys = new ArrayList<>();
        
        for (Survey survey : surveyList) {
            if(survey.getStudentID() == id) {
                surveys.add(survey);
            }
        }
        return surveys;
    }

    @Override
    public int deleteSurvey(Survey survey) {
        return deleteSurvey(survey.getSurveyID());
    }

    @Override
    public int deleteSurvey(int surveyId) {
        for (Survey survey : surveyList) {
            if(survey.getSurveyID() == surveyId) {
                surveyList.remove(survey);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public ArrayList<Survey> retrieveAllSurveys() {
        return surveyList;
    }
    
}
