package org.itstep.dao;

import org.itstep.ApplicationRunner;
import org.itstep.model.Group;
import org.itstep.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(ApplicationRunner.class)
public class StudentDAOTest {

    @Autowired
    GroupDAO groupDAO;

    @Autowired
    StudentDAO studentDAO;

    @Test
    public void createAndDelete(){
        Group group = new Group();
        group.setName("test group");
        group.setYear(2019);

        Group groupInDB = groupDAO.save(group);

//        Student student = new Student();
//        student.setGroup(groupInDB);
//        student.setLogin("Alex");
//        student.setPass("12345");
//
//        Student studentInDB = studentDAO.save(student);
//
//        assertNotNull(studentInDB);
//        assertEquals("Alex", studentInDB.getLogin());
//        assertEquals("test group", studentInDB.getGroup().getName());
//
//        studentDAO.delete(studentInDB);
//        groupDAO.delete(groupInDB);
//
//        assertNull(studentDAO.findById(studentInDB.getId()));

    }
}