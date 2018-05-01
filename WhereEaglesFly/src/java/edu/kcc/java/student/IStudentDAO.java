/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.java.student;


import java.util.ArrayList;
import edu.kcc.java.survey.Survey;
/**
 *
 * @author Wes Richardson
 */
public interface IStudentDAO {

    int create(Student student);
    
    int edit(Student newStudent, Student oldStudent);
    
    Student retrieve(int studentID);
    
    ArrayList<Student> retrieve();
    
    int deactivate(int studentID);
    
//    int getIdByVerificationCode(String verificationCode);
//
//    ArrayList<Student> getStudentsWithCompletedSurveys();
//
//    Student getStudentById(int id);
//
//    ArrayList<Student> getStudentsWithUncompletedSurveys();
//
//    void deactivateStudentById(int id);
//
//    void createStudent(String firstName, String lastName, String email);
//
//    void updateStudnet(Student student);
//
//    ArrayList<Location> getLocations();
//
//    Location getLocationByStudentId(int studentId);
//
//    void deactivateLocationByStudentId(int studnetId);
//
//    void createLocation(Location location);
//
//    void updateLocation(Location location);
//
//    ArrayList<Survey> getSurveys();
//
//    Survey getSurveyByStudentId(int studentId);
//
//    void deactivateSurveyByStudentId(int studentId);
//
//    void createSurvey(Survey survey);
//
//    void updateSurvey(Survey survey);

}
