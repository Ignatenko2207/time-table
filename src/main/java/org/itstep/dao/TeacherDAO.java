package org.itstep.dao;

import org.itstep.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDAO extends CrudRepository<Teacher, Integer> {
}
