package org.mvc.repository;

import org.mvc.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student s)
    {//count must be matched
        String query="insert into student_details values ('"+3+"','"+s.getFullName()+"','"+s.getEmail()+"','"+s.getMobileNo()+"','"+s.getPassword()+"',"+"',"+s.getCourse()+"')";
        return jdbcTemplate.update(query);
    }

    public int updateStudent(Student s)
    {
        String query = "update student set name ="+s.getFullName()+","+s.getEmail()+","+s.getMobileNo()+","+s.getPassword()+","+s.getCourse()+"where id = "+s.getId();
        return jdbcTemplate.update(query);
    }
}
