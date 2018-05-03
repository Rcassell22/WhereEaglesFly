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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deactivate(int studentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
