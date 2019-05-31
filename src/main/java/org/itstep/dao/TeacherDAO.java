package org.itstep.dao;

import org.itstep.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDAO extends CrudRepository<Teacher, Integer> {
}
