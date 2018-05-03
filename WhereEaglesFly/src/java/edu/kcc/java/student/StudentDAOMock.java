package edu.kcc.java.student;

import java.util.ArrayList;

/**
 *
 * @author Brady Feller
 */
public class StudentDAOMock implements IStudentDAO{

    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int minID = 1000000;
    
    
    public StudentDAOMock() {

        Student testStudent = new Student();
        testStudent.setStudentId(minID);
        studentList.add(testStudent);
        testStudent.setStudentId(minID + 1);
        studentList.add(testStudent);
        testStudent.setStudentId(minID + 2);
        studentList.add(testStudent);
    }
    
    @Override
    public int create(Student student) {
        
        return addNewStudent(student);
        
    }

    @Override
    public int edit(Student newStudent, Student oldStudent) {
        
        int rowsAffected = 0;
        
        for (Student s : studentList) {
            if (s.getStudentId() == oldStudent.getStudentId()) {
                s = newStudent;
            }
        }
        
        for (Student s : studentList) {
            if (s == newStudent) {
                rowsAffected = 1;
            }
        }
        
        return rowsAffected;
    }

    @Override
    public Student retrieve(int studentID) {
        
        Student student = new Student();
        
        for (Student s : studentList) {
            if (s.getStudentId() == studentID) {
                student = s;
            }
        }

        return student;
    }

    @Override
    public ArrayList<Student> retrieve() {
        
        return studentList;
        
    }

    @Override
    public int deactivate(int studentID) {
        
        Student student = new Student();
        int rowsAffected = 0;
        
        for (Student s : studentList) {
            if (s.getStudentId() == studentID) {
                s.setActive(false);
                student = s;
            }
        }
        
        if (student.isActive() == false) {
            rowsAffected = 1;
        }
        
        return rowsAffected;
    }
    
    private int addNewStudent(Student student) {
        
        int newStudentID = 0;
        
        int listCount = studentList.size();
        
        newStudentID = minID + listCount;
        
        student.setStudentId(newStudentID);
        
        studentList.add(student);
        
        if (studentList.size() == listCount) {
            
            newStudentID = 0;
        }
          
        return newStudentID;
    }
    
    
}
