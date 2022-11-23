package org.mvc.service;

import org.mvc.entity.Student;
import org.mvc.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class StudentService {

    @Autowired
    private  StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public boolean toSaveEmployee(Student student)
    { int i =  studentDao.saveStudent(student);
       if(i>0)
       {
           return true;
       }
       else return false;
    }


}
